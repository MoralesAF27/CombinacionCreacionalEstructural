/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Estudiantes
 */

import javax.swing.JOptionPane;

public class Cliente {
    public static void main(String[] args) {
        Adapter adaptador = new Adapter();
        Entrada entrada = null;
        String[] opciones = {"Consola", "Ventana (Frame)"};
        int opcion = JOptionPane.showOptionDialog(
            null,
            "Seleccione el método de entrada:",
            "Método de Entrada",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );

        switch (opcion) {
            case 0:
                entrada = new EntradaConsola();
                break;
            case 1:
                entrada = new EntradaFrame();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida. Saliendo del programa...");
                return;
        }

        // Ingresar el dato según la opción elegida
        String entradaUsuario = entrada.ingresarDatos();

        // Convertir el dato a diferentes tipos de datos
        Object datoEntero = adaptador.convertirSalida(entradaUsuario, Integer.class);
        Object datoDouble = adaptador.convertirSalida(entradaUsuario, Double.class);
        Object datoBoolean = adaptador.convertirSalida(entradaUsuario, Boolean.class);
        Object datoString = adaptador.convertirSalida(entradaUsuario, String.class);

        // Formatear el resultado
        String resultado = "Dato como Integer: " + datoEntero + "\n"
                         + "Dato como Double: " + datoDouble + "\n"
                         + "Dato como Boolean: " + datoBoolean + "\n"
                         + "Dato como String: " + datoString;

        // Mostrar resultados en consola o en ventana según la elección
        if (opcion == 0) {
            System.out.println(resultado);
        } else {
            JOptionPane.showMessageDialog(null, resultado, "Resultados", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}


