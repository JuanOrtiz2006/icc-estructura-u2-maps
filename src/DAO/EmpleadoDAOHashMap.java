package DAO;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO{
        private Map<Empleado,Empleado> empleados;


    public EmpleadoDAOHashMap() {
        empleados = new HashMap<>();
    }

    public void crearUsuario(Empleado empleado){
        if (empleado != null) {
            empleados.put(empleado, empleado);
            System.out.println("Empleado creado: " + empleado);
        } else {
            System.out.println("Empleado no puede ser nulo");
        }
    }

    public void eliminarEmpleado(int id){
        Empleado temp = new Empleado(id);
        empleados.remove(temp);
    }


    public void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado empleado : empleados.values()) {
                System.out.println(empleado);
            }
        }
    }

}
