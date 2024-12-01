
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tamar
 */
public class Cine {

    private ArrayList<SalaCine> salas;
    private ArrayList<Empleado> empleados;

    public Cine() {
        salas = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    public void agregarSala(SalaCine sala) {
        salas.add(sala);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public Empleado buscarEmpleadoPorId(String id) {
        for (Empleado e : empleados) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public void mostrarSalas() {
        StringBuilder sb = new StringBuilder("Salas disponibles:\n");
        for (int i = 0; i < salas.size(); i++) {
            sb.append((i + 1)).append(". Película: ").append(salas.get(i).getNombrePelicula())
                    .append(" (Asientos libres: ").append(salas.get(i).contarAsientosLibres()).append(")\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public void reservarAsiento(int salaIndex, int fila, int columna, Empleado empleado) {
        if (salaIndex >= 0 && salaIndex < salas.size()) {
            SalaCine sala = salas.get(salaIndex);
            if (sala.reservarAsiento(fila, columna)) {
                JOptionPane.showMessageDialog(null, "Reserva realizada con éxito para " + empleado.getNombre());
            } else {
                JOptionPane.showMessageDialog(null, "El asiento ya está ocupado o es inválido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número de sala inválido.");
        }
    }
}
