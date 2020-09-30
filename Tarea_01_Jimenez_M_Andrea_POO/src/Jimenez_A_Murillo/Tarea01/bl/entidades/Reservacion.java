package Jimenez_A_Murillo.Tarea01.bl.entidades;

public class Reservacion {
    private String fechaEntrada;
    private String fechaSalida;
    private Mascota Mascota;
    private Usuario usuario;

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Mascota getMascota() {
        return Mascota;
    }

    public void setMascota(Mascota mascota) {
        Mascota = mascota;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Reservacion(String fechaEntrada, String fechaSalida, Mascota mascota, Usuario usuario) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.Mascota = mascota;
        this.usuario = usuario;
    }

    public Reservacion() {
    }

    @Override
    public String toString() {
        return "Reservacion: " +
                "Fecha de Entrada='" + fechaEntrada + '\'' +
                ", Fecha de Salida='" + fechaSalida + '\'' +
                ", Mascota='" + Mascota + '\'' +
                ", Usuario='" + usuario + '\'' +
                '}';
    }
}

