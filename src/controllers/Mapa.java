package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;
public class Mapa {
    public Mapa() {
    }


    public void ejemploConHashMap() {
        Map <String,String> capitales= new HashMap<>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Peru", "Lima");
        capitales.put("Colombia", "Bogota");

        System.out.println("Capitales.keySet = " + capitales.keySet());
        
        for(String pais : capitales.keySet()) {
            System.out.println("Pais: " + pais + ", Capital: " + capitales.get(pais));
        }

        //Ejemplo de acceso directo
        String capitalEcuador = capitales.get("Ecuador");
        System.out.println("Capital de Ecuador: " + capitalEcuador);

        System.out.println();

        Map <Integer, Empleado> empleados = new HashMap<>();

        empleados.put(1, new Empleado(3, "Pedro", "Tester"));
        empleados.put(2, new Empleado(1, "Ana", "Dev"));
        empleados.put(3, new Empleado(2, "Luis", "Diseñador"));

        for(Map.Entry<Integer,Empleado> entry : empleados.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Empleado: " + entry.getValue().getName() + ", Cargo: " + entry.getValue().getPosition());
        }

        Map<Empleado, Integer> empleadosDos = new HashMap<>();

        Empleado empleado1 = new Empleado(1, "Ana", "Dev");
        Empleado empleado2 = new Empleado(2, "Pedro", "Dev");
        Empleado empleado3 = new Empleado(3, "Ana", "Dev");
        Empleado empleado4 = new Empleado(3, "Ana", "Dev");

        empleadosDos.put(empleado1, 1000);
        empleadosDos.put(empleado2, 1200);
        empleadosDos.put(empleado3, 1500);
        empleadosDos.put(empleado4, 2000);

        for(Map.Entry<Empleado, Integer> entry : empleadosDos.entrySet()) {
            System.out.println(entry.getKey() + " =>" + entry.getValue());
        }

        
    }

    public void ejemploConLinkedHashMap() {
        Map<String, Integer> productos = new LinkedHashMap<>();
        productos.put("Celular", 200);
        productos.put("Laptop", 800);
        productos.put("Tablet", 300);
        productos.put("Smartwatch", 150);
        productos.put("Televisor", 600);

        for(String producto : productos.keySet()) {
            System.out.println("Producto: " + producto + ", Precio: $" + productos.get(producto));
        }

        System.out.println();
    }

    public void ejemploConTreeMap() {
        Map<Integer,String> personas = new TreeMap<>();
        personas.put(2, "Luis");
        personas.put(5, "Pedro");
        personas.put(3, "Carlos");
        personas.put(1, "Ana");
        personas.put(4, "Maria");
        for(Integer id : personas.keySet()) {
            System.out.println("ID: " + id + ", Nombre: " + personas.get(id));
        }

        System.out.println();


        Map<Empleado, Integer> empleadosDos = new TreeMap<>();

    }
}
