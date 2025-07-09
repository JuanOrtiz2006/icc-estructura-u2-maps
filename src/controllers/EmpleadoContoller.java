package controllers;

import DAO.EmpleadoDAO;

import java.util.ArrayList;
import java.util.List;


import models.Empleado;

public class EmpleadoContoller {
    private EmpleadoDAO empleadoDAO;

    List<Empleado> empleados = new ArrayList<>();
    
    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        empleados  = new ArrayList<>();
        this.empleadoDAO = empleadoDAO;
    }

    public void agregarEmpleado(Empleado empleado){
        empleadoDAO.crearUsuario(empleado);
    }

    public void eliminarEmpleado(int id){
        empleadoDAO.eliminarEmpleado(id);
    }

    public void listarEmpleados(){
        empleadoDAO.listarEmpleados();
    }

}