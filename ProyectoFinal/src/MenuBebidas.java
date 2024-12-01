
import java.time.LocalTime;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author tamar
 */
public enum MenuBebidas {
    CAFE_NORMAL("Café Normal"),
    CAPUCHINO("Capuchino"),
    CAPUCHINO_VAINILLA("Capuchino con Vainilla"),
    CHOCOLATE("Chocolate"),
    MOKA("Moka"),
    TE_CHAI("Té Chai"),
    CAFE_FRIO("Café Frío");

    private String nombre;

    MenuBebidas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Mostrar el menú de bebidas
    public static void mostrarMenu() {
        StringBuilder sb = new StringBuilder("Menú de Bebidas:\n");
        for (int i = 0; i < values().length; i++) {
            sb.append(i + 1).append(". ").append(values()[i].getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // Seleccionar una bebida
    public static Bebida seleccionarBebida(int opcion) {
        if (opcion >= 1 && opcion <= values().length) {
            return new Bebida(values()[opcion - 1].getNombre(), LocalTime.now());
        }
        return null;
    }
}
