package com.example.tarea_2_gtics.controller;

import com.example.tarea_2_gtics.model.Entity.Employee;
import com.example.tarea_2_gtics.model.Entity.Job;
import com.example.tarea_2_gtics.model.repository.EmployeeRepository;
import com.example.tarea_2_gtics.model.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;
    private final JobRepository jobRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository, JobRepository jobRepository) {
        this.employeeRepository = employeeRepository;
        this.jobRepository = jobRepository;
    }

    @GetMapping({"list", ""})
    public String listarEmpleados(Model model) {
        try {
            List<Employee> lista = employeeRepository.findAll();
            model.addAttribute("employeeList", lista);
            return "listaEmpleados";
        } catch (Exception e) {
            model.addAttribute("error", "Error al obtener la lista de empleados.");
            return "errorPage";
        }
    }

    @GetMapping("/info/{id}")
    public String informEmpleado(@PathVariable("id") Long id, Model model) {
        try {
            Optional<Employee> optEmployee = employeeRepository.findById(id);
            if (optEmployee.isPresent()) {
                Employee employee = optEmployee.get();
                model.addAttribute("employee", employee);
                model.addAttribute("selectedJobId", employee.getJob() != null ? employee.getJob().getJob_id() : null);
            } else {
                model.addAttribute("error", "Empleado no encontrado.");
                return "errorPage";
            }

            List<Job> jobs = jobRepository.findAll();
            model.addAttribute("jobs", jobs);
            return "infoEmpleado";
        } catch (Exception e) {
            model.addAttribute("error", "Error al obtener la información del empleado.");
            return "errorPage";
        }
    }

    @GetMapping("/delete")
    public String borrarEmpleado(@RequestParam("id") Long id, RedirectAttributes redirectAttributes) {
        try {
            Optional<Employee> optEmployee = employeeRepository.findById(id);
            if (optEmployee.isPresent()) {
                employeeRepository.deleteById(id);
                redirectAttributes.addFlashAttribute("exito", "Empleado borrado correctamente.");
            } else {
                redirectAttributes.addFlashAttribute("error", "Empleado no encontrado.");
            }
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error al borrar el empleado.");
        }
        return "redirect:/employee/list";
    }
}

