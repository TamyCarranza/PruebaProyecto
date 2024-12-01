
import java.util.Scanner;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tamar
 */
public class ClaseYoga {
    private static final int MAXIMO_CUPOS = 30;
    private String[] clase7pm = new String[MAXIMO_CUPOS];
    private String[] clase8pm = new String[MAXIMO_CUPOS];
    private int asistentes7pm = 0;
    private int asistentes8pm = 0;

    public void reservarClase(int hora, Scanner scanner) {
        String[] clase = (hora == 7) ? clase7pm : clase8pm;
        int asistentes = (hora == 7) ? asistentes7pm : asistentes8pm;

        if (asistentes < MAXIMO_CUPOS) {
            scanner.nextLine();  // Limpiar buffer
            System.out.print("Introduce tu nombre para realizar la reservación: ");
            String nombre = scanner.nextLine();
            System.out.print("Introduce tu número de teléfono: ");
            String telefono = scanner.nextLine();
            System.out.print("Introduce tu correo electrónico: ");
            String correo = scanner.nextLine();

            clase[asistentes] = nombre;
            asistentes++;

            if (hora == 7) {
                asistentes7pm++;
            } else {
                asistentes8pm++;
            }

            System.out.println("La reserva fue realizada con éxito para la clase de Yoga a las " + hora + ":00 pm!");
            System.out.println("Recuerda estar 10 minutos antes, " + nombre + "!");
        } else {
            System.out.println("Lo siento, la clase de Yoga a las " + hora + ":00 pm ya está llena.");
            System.out.println("¿Te gustaría intentar reservar para la otra hora?");
        }
    }
}
