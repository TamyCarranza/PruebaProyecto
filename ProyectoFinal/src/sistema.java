
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author tamar
 */
public class sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Cine cine = new Cine();
        ClaseYoga claseYoga = new ClaseYoga();
        // Agregar salas de cine
        cine.agregarSala(new SalaCine("Avengers", 5, 5));
        cine.agregarSala(new SalaCine("Inception", 6, 5));

        // Agregar empleados
        cine.agregarEmpleado(new Empleado("E001", "Carlos"));
        cine.agregarEmpleado(new Empleado("E002", "Ana"));

        int opcion;
        do {
            System.out.println("\nBienvenido al sistema de servicios:");
            System.out.println("1. Reservar cine");
            System.out.println("2. Reservar clase de yoga");
            System.out.println("3. Pedir bebida");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\n--- Reservar Cine ---");
                    int cineOpcion;
                    do {
                        System.out.println("\n1. Ver salas disponibles");
                        System.out.println("2. Reservar asiento");
                        System.out.println("3. Regresar al menú principal");
                        System.out.print("Elige una opción: ");
                        cineOpcion = scanner.nextInt();

                        switch (cineOpcion) {
                            case 1 -> cine.mostrarSalas();
                            case 2 -> {
                                // Reservar asiento en cine
                                System.out.print("Ingresa tu ID de empleado: ");
                                String empleadoId = scanner.next();
                                Empleado empleado = cine.buscarEmpleadoPorId(empleadoId);
                                if (empleado != null) {
                                    cine.mostrarSalas();
                                    System.out.print("Elige el número de sala: ");
                                    int salaIndex = scanner.nextInt() - 1;
                                    System.out.print("Ingresa la fila del asiento: ");
                                    int fila = scanner.nextInt();
                                    System.out.print("Ingresa la columna del asiento: ");
                                    int columna = scanner.nextInt();
                                    cine.reservarAsiento(salaIndex, fila, columna, empleado);
                                } else {
                                    System.out.println("ID de empleado no encontrado.");
                                }
                            }
                        }
                    } while (cineOpcion != 3);
                }
                case 2 -> {
                    System.out.println("\n--- Reservar Clase de Yoga ---");
                    System.out.println("1. Clase 7:00 pm");
                    System.out.println("2. Clase 8:00 pm");
                    System.out.print("Elige una opción: ");
                    int horaClase = scanner.nextInt();
                    claseYoga.reservarClase(horaClase, scanner);
                }
                case 3 -> {
                    // Pedir bebida
                    System.out.println("\n--- Pedir Bebida ---");
                    MenuBebidas.mostrarMenu();
                    System.out.print("Selecciona una bebida (número): ");
                    int bebidaOpcion = scanner.nextInt();
                    System.out.print("Ingresa tu nombre: ");
                    scanner.nextLine();  // Limpiar buffer
                    String nombreEmpleado = scanner.nextLine();

                    Bebida bebida = MenuBebidas.seleccionarBebida(bebidaOpcion);
                    if (bebida != null) {
                        PedidoBebida pedido = new PedidoBebida(bebida, nombreEmpleado);
                        pedido.mostrarPedido();
                    }
                }
                case 4 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}