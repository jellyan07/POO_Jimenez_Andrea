package Jimenez_A_Murillo.Tarea01.ui;

import java.io.PrintStream;

public class UI {
    private static PrintStream output = new PrintStream(System.out);

    public static void showMenu() {
        output.println("Bienvenido al admin de la tienda de mascotas");
        output.println("1. Registrar Mascotas");
        output.println("2. Listar Mascotas");
        output.println("3. Registrar Usuarios");
        output.println("4. Listar Usuarios");
        output.println("5. Agendar Cita");
        output.println("6. Agendar Reservación");
        output.println("7. Listar Reservaciones");
        output.println("8. Listar Citas");
        output.println("7. Salir");
        output.println("Ingrese su opción -->");
    }
}
