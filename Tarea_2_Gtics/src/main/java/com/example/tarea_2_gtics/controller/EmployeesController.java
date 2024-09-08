package com.example.tarea_2_gtics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeesController {

    private EmployeeDAO employeesDAO = new EmployeeDAO();
    private JobDAO  jobsDAO = new JobDAO();

    @GetMapping({"employee/list", "employee"})
    public String listarEmpleados() {
//        COMPLETAR
        return "XXXXXX";
    }

    @GetMapping("")
    public String informEmpleado() {
        //        COMPLETAR
        return "XXXXXX";
    }

    @GetMapping("")
    public String borrarEmpleado(Model model) {
        model.addAttribute("tipo_alert", "success");
        model.addAttribute("msg", "Se borro el empleado");
//        COMPLETAR
        return "XXXXXX";
    }

}
