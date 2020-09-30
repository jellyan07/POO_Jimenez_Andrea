package Jimenez_A_Murillo.Tarea01.bl.entidades;

import jdk.nashorn.internal.ir.ReturnNode;

public class Duenno {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int cedula;
    private int numero;
    private String direccion;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "- Nombre: "+this.nombre+this.apellido1+this.apellido2 + " Cédula: "
                + this.cedula + " Número: "+this.numero+"Dirección: "+this.direccion;
    }

    public Duenno() {
    }

    public Duenno(String nombre, String apellido1, String apellido2, int cedula, int numero, String direccion){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.numero = numero;
        this.direccion = direccion;
    }
}
