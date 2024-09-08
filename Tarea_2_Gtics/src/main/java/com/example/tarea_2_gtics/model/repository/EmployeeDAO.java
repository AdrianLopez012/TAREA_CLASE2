package com.example.tarea_2_gtics.model.repository;

import java.util.ArrayList;

public class EmployeeDAO extends BaseDAO {

    public ArrayList<Employee> findAll() {

        ArrayList<Employee> listaEmpleados = new ArrayList<>();

        //        COMPLETAR

        return listaEmpleados;
    }

    public Employee findById(int id) {

        Employee employee = new Employee();

        //        COMPLETAR

        return employee;
    }

    public boolean deleteById(int id) {
        String sql = " //        COMPLETAR";
        boolean flag = false;
        //        COMPLETAR
        flag = true;

        return flag;
    }

}