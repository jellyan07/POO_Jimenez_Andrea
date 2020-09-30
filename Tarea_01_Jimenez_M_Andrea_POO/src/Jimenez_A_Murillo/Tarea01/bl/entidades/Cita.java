package Jimenez_A_Murillo.Tarea01.bl.entidades;

public class Cita {
    private String fecha;
    private Mascota mascota;
    private Usuario usuario;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cita(String fecha, Mascota mascota, Usuario usuario) {
        this.fecha = fecha;
        this.mascota = mascota;
        this.usuario = usuario;
    }

    public Cita() {
    }

    @Override
    public String toString() {
        return "Cita: " +
                "Fecha='" + fecha + '\'' +
                ", Mascota=" + mascota +
                ", Usuario=" + usuario +
                '}';
    }
}
