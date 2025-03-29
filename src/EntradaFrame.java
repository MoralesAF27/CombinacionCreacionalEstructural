
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */

public class EntradaFrame implements Entrada {
    @Override
    public String ingresarDatos() {
        return JOptionPane.showInputDialog("Ingrese datos en el cuadro de diálogo:");
    }

    @Override
    public String ingresarDatos(Object dato, Adapter adaptador) {
        return adaptador.convertirEntrada(dato);
    }
}



