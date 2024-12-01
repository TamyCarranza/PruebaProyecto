/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tamar
 */
public class Empleado {
    private String id;
    private String nombre;
    private boolean pedidoRealizado;  // Variable para verificar si el empleado ya hizo un pedido

    public Empleado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.pedidoRealizado = false;  // Inicialmente, el empleado no ha hecho un pedido
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isPedidoRealizado() {
        return pedidoRealizado;
    }

    public void setPedidoRealizado(boolean pedidoRealizado) {
        this.pedidoRealizado = pedidoRealizado;
    }
}
