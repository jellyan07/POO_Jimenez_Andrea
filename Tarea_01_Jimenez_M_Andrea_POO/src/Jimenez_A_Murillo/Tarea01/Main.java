package Jimenez_A_Murillo.Tarea01;

import Jimenez_A_Murillo.Tarea01.bl.Logica;
import Jimenez_A_Murillo.Tarea01.bl.entidades.Cita;
import Jimenez_A_Murillo.Tarea01.bl.entidades.Mascota;
import Jimenez_A_Murillo.Tarea01.bl.entidades.Reservacion;
import Jimenez_A_Murillo.Tarea01.bl.entidades.Usuario;
import Jimenez_A_Murillo.Tarea01.ui.UI;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static PrintStream output = new PrintStream(System.out);

    public static Mascota[] arregloMascotas = new Mascota[50];
    public static int nextPosicion = 0;

    public static Usuario[] arregloUsuarios = new Usuario[50];
    public static int nextPosicion_U = 0;

    public static Reservacion[] arregloReservaciones = new Reservacion[50];
    public static int nextPosicion_R = 0;

    public static Cita[] arregloCitas = new Cita[50];
    public static int nextPosicion_C = 0;

    public static void main(String[] args) {
        UI interfaz = new UI();
        Logica menu = new Logica();
        int opcion = 0;
        do {
            interfaz.showMenu();
            opcion = input.nextInt();
            menu.procesarOpcion(opcion);
        } while (opcion != 7);
    }

}
