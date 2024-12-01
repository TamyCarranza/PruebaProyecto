
import java.time.LocalTime;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tamar
 */
public class PedidoBebida {
    private Bebida bebida;
    private String nombreEmpleado;

    public PedidoBebida(Bebida bebida, String nombreEmpleado) {
        this.bebida = bebida;
        this.nombreEmpleado = nombreEmpleado;
    }

    public void mostrarPedido() {
        JOptionPane.showMessageDialog(null,
                "Pedido realizado con éxito.\n" +
                "Empleado: " + nombreEmpleado + "\n" +
                "Bebida: " + bebida.getNombre() + "\n" +
                "Hora de entrega: " + bebida.getHoraEntrega().toString());
    }
}