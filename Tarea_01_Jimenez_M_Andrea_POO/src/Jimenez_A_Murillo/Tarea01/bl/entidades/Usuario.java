package Jimenez_A_Murillo.Tarea01.bl.entidades;

public class Usuario {
    private int cedula;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int numero;
    private String direccion;
    private boolean activo;
    private String rol;


    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario(int cedula, String nombre, String apellido1, String apellido2, int numero, String direccion, boolean activo, String rol) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.numero = numero;
        this.direccion = direccion;
        this.activo = activo;
        this.rol = rol;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario: " +
                "cedula=" + cedula +
                ", nombre='" + nombre + apellido1 + apellido2 + '\'' +
                ", numero=" + numero +
                ", direccion='" + direccion + '\'' +
                ", activo=" + activo +
                ", rol='" + rol + '\'' +
                '}';
    }
}
