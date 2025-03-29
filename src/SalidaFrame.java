
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
import javax.swing.JOptionPane;

public class SalidaFrame implements Salida {
    @Override
    public void mostrarDatos(String mensaje) {
        JOptionPane.showMessageDialog(null, "Salida en cuadro de diálogo: " + mensaje);
    }

    @Override
    public void mostrarDatos(String mensaje, Class<?> tipo, Adapter adaptador) {
        JOptionPane.showMessageDialog(null, "Salida en cuadro de diálogo (convertida): " + adaptador.convertirSalida(mensaje, tipo));
    }
}

