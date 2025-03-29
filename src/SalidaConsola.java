/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class SalidaConsola implements Salida {
    @Override
    public void mostrarDatos(String mensaje) {
        System.out.println("Salida en consola: " + mensaje);
    }

    @Override
    public void mostrarDatos(String mensaje, Class<?> tipo, Adapter adaptador) {
        System.out.println("Salida en consola (convertida): " + adaptador.convertirSalida(mensaje, tipo));
    }
}

