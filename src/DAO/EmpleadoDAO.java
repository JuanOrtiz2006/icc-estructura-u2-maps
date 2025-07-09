package DAO;

import models.Empleado;
public interface EmpleadoDAO {
    public abstract void crearUsuario(Empleado empleado);
    public abstract void eliminarEmpleado(int id);
    public abstract void listarEmpleados();
}
