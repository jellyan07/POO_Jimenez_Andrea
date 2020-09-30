package Jimenez_A_Murillo.Tarea01.bl;

import Jimenez_A_Murillo.Tarea01.bl.entidades.*;

import javax.swing.*;
import java.io.PrintStream;
import java.util.Scanner;

import static Jimenez_A_Murillo.Tarea01.Main.*;

public class Logica {

    private static Scanner input = new Scanner(System.in);
    private static PrintStream output = new PrintStream(System.out);

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                output.println("Nombre de la mascota");
                String nombre = input.next();
                output.println("Observaciones");
                String observaciones = input.next();
                output.println("Ranking de la mascota");
                int ranking = input.nextInt();

                output.println("Ingrese el nombre del dueño");
                String nombre_duenno = input.next();
                output.println("Ingrese el primer apellido del dueño");
                String apellido1 = input.next();
                output.println("Ingrese el segundo apellido del dueño");
                String apellido2 = input.next();
                output.println("Cédula del dueño");
                int cedula = input.nextInt();
                output.println("Ingrese el número telefónico del dueño (sin guión)");
                int numero = input.nextInt();
                output.println("Ingrese la dirección de residencia");
                String direccion = input.next();

                Duenno nuevo = new Duenno(nombre_duenno,apellido1,apellido2,cedula,numero,direccion);

                Mascota nueva = new Mascota(nombre, observaciones, ranking, nuevo);
                arregloMascotas[nextPosicion++] = nueva;
                break;
            case 2:
                for (int i= 0; i < arregloMascotas.length; i++) {
                    if (arregloMascotas[i] != null) {
                        output.println(i+1 + ". " + arregloMascotas[i]);
                    }
                }
                break;
            case 3:
                output.println("Ingrese el nombre del usuario");
                String nombre_u = input.next();
                output.println("Ingrese el primer apellido del usuario");
                String apellido1u = input.next();
                output.println("Ingrese el segundo apellido del usuario");
                String apellido2u = input.next();
                output.println("Cédula del usuario");
                int cedula_u = input.nextInt();
                output.println("Ingrese el número telefónico del usuario (sin guión)");
                int numero_u = input.nextInt();
                output.println("Ingrese la dirección de residencia");
                String direccion_u = input.next();
                output.println("Ingrese la opción 1 si es un usuario activo y 2 si es inactivo");
                String activo_u = input.next();
                boolean activo = true;
                switch (activo_u) {
                    case "1":
                        activo = true;
                        break;
                    case "2":
                        activo = false;
                        break;
                    default:

                }
                output.println("Escriba si el rol del usuario");
                String rol = input.next();

                Usuario nuevo_u = new Usuario(cedula_u, nombre_u ,apellido1u, apellido2u, numero_u, direccion_u, activo, rol);
                arregloUsuarios[nextPosicion_U++] = nuevo_u;

                break;
            case 4:
                for (int i= 0; i < arregloUsuarios.length; i++) {
                    if (arregloUsuarios[i] != null) {
                        output.println(i+1 + ". " + arregloUsuarios[i]);
                    }
                }
                break;
            case 5:
                output.println("Ingrese el dia que será la cita");
                String dia = input.next();
                output.println("Ingrese el mes de será la cita");
                String mes_cita = input.next();
                String fecha_cita = dia + " / " + mes_cita;
                output.println("Ingrese el nombre de la mascota que será agendada");

                /* Listar Mascotas */

                boolean match = false;
                String mascota_input;
                Mascota mascota_cita = new Mascota();

                do {
                    output.println("*** Recuerde que debe ser un nombre válido de la lista ***");
                    for (int i = 0; i < arregloMascotas.length; i++) {
                        if (arregloMascotas[i] != null) {
                            output.println(i + 1 + ". " + arregloMascotas[i].getNombre());
                        }
                    }

                    // Lee la mascota y verifica que sea una registrada

                    mascota_input = input.next();
                    for (int i = 0; i < arregloMascotas.length; i++) {
                        if (mascota_input == arregloMascotas[i].getNombre()) {
                            match = true;
                            mascota_cita = arregloMascotas[i];
                        }
                    }
                } while (match == false);

                    // Mismo procedimiento para el usuario

                    output.println("Ingrese el nombre del usuario que la atenderá");

                    /* Listar usuarios */

                    match = false;
                    String usuario_input;
                    Usuario usuario_cita = new Usuario();

                    do {
                        output.println("*** Recuerde que debe ser un nombre válido de la lista ***");
                        for (int i= 0; i < arregloUsuarios.length; i++) {
                            if (arregloUsuarios[i] != null) {
                                output.println(i+1 + ". " + arregloUsuarios[i].getNombre());
                            }
                        }

                        // Lee el usuario y verifica que sea uno registrado

                        usuario_input = input.next();

                        for (int i= 0; i < arregloUsuarios.length; i++) {
                            if (usuario_input == arregloUsuarios[i].getNombre()) {
                                match = true;
                                usuario_cita = arregloUsuarios[i];
                            }
                        }

                } while (match==true);

                Cita reservar = new Cita(fecha_cita, mascota_cita, usuario_cita);
                arregloCitas[nextPosicion_C] = reservar;

                break;
            case 6:
                output.println("Ingrese el dia de ingreso");
                String dia_reserva = input.next();
                output.println("Ingrese el mes de ingreso");
                String mes_reserva = input.next();
                String fecha_entrada = dia_reserva + " / " + mes_reserva;

                output.println("Ingrese el dia de salida");
                dia_reserva = input.next();
                output.println("Ingrese el mes de salida");
                mes_reserva = input.next();
                String fecha_salida = dia_reserva + " / " + mes_reserva;

                output.println("Ingrese el nombre de la mascota que será agendada");

                /* Listar Mascotas */

                match = false;
                mascota_cita = new Mascota();

                do {
                    output.println("*** Recuerde que debe ser un nombre válido de la lista ***");
                    for (int i = 0; i < arregloMascotas.length; i++) {
                        if (arregloMascotas[i] != null) {
                            output.println(i + 1 + ". " + arregloMascotas[i].getNombre());
                        }
                    }

                    // Lee la mascota y verifica que sea una registrada

                    mascota_input = input.next();
                    for (int i = 0; i < arregloMascotas.length; i++) {
                        if (mascota_input == arregloMascotas[i].getNombre()) {
                            match = true;
                            mascota_cita = arregloMascotas[i];
                        }
                    }
                } while (match == false);

                // Mismo procedimiento para el usuario

                output.println("Ingrese el nombre del usuario que la atenderá");

                /* Listar usuarios */

                match = false;
                usuario_cita = new Usuario();

                do {
                    output.println("*** Recuerde que debe ser un nombre válido de la lista ***");
                    for (int i= 0; i < arregloUsuarios.length; i++) {
                        if (arregloUsuarios[i] != null) {
                            output.println(i+1 + ". " + arregloUsuarios[i].getNombre());
                        }
                    }

                    // Lee el usuario y verifica que sea uno registrado

                    usuario_input = input.next();

                    for (int i= 0; i < arregloUsuarios.length; i++) {
                        if (usuario_input == arregloUsuarios[i].getNombre()) {
                            match = true;
                            usuario_cita = arregloUsuarios[i];
                        }
                    }

                } while (match==true);

                Reservacion reserva = new Reservacion(fecha_entrada, fecha_salida, mascota_cita, usuario_cita);
                arregloReservaciones[nextPosicion_R] = reserva;

            default:
                output.println("Opción inválida");
        }
    }
}
