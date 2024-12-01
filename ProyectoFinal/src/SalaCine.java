/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tamar
 */
public class SalaCine {
    private String nombrePelicula;
    private char[][] asientos;

    public SalaCine(String nombrePelicula, int filas, int columnas) {
        if (filas * columnas == 25 || filas * columnas == 30) {
            this.nombrePelicula = nombrePelicula;
            this.asientos = new char[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    asientos[i][j] = 'O'; // O para asiento libre
                }
            }
        } else {
            throw new IllegalArgumentException("El tamaño de la sala debe ser de 25 o 30 asientos.");
        }
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public boolean reservarAsiento(int fila, int columna) {
        if (fila >= 0 && fila < asientos.length && columna >= 0 && columna < asientos[0].length && asientos[fila][columna] == 'O') {
            asientos[fila][columna] = 'X'; // X para asiento ocupado
            return true;
        }
        return false;
    }

    public String mostrarAsientos() {
        StringBuilder sb = new StringBuilder("Estado de los asientos:\n");
        for (char[] asiento : asientos) {
            for (int j = 0; j < asiento.length; j++) {
                sb.append(asiento[j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public int contarAsientosLibres() {
        int libres = 0;
        for (char[] fila : asientos) {
            for (char asiento : fila) {
                if (asiento == 'O') {
                    libres++;
                }
            }
        }
        return libres;
    }
}