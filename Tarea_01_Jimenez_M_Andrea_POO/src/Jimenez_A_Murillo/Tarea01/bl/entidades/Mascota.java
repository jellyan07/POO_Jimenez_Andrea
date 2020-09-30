package Jimenez_A_Murillo.Tarea01.bl.entidades;

public class Mascota {
    private String nombre;
    private String observaciones;
    private int ranking;
    private Duenno duenno;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Duenno getDuenno() {
        return duenno;
    }

    public void setDuenno(Duenno duenno) {
        this.duenno = duenno;
    }

    @Override
    public String toString(){
        return " -Nombre: "+ this.nombre + ". Observaciones: "
                + this.observaciones +". Ranking: " + this.ranking + ". Dueño: " + this.duenno;
    }

    public Mascota() {
    }

    public Mascota(String nombre, String observaciones, int ranking, Duenno duenno){
        this.nombre = nombre;
        this.observaciones = observaciones;
        this. ranking = ranking;
        this.duenno = duenno;
    }

}
