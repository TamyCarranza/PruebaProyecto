
import java.time.LocalTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tamar
 */
public class Bebida {
    private String nombre;
    private LocalTime horaEntrega;  // Usamos LocalTime para representar mejor la hora

    public Bebida(String nombre, LocalTime horaEntrega) {
        this.nombre = nombre;
        this.horaEntrega = horaEntrega;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }
}