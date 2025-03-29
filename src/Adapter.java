/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Adapter {
    // Convierte cualquier tipo de dato a String
    public String convertirEntrada(Object dato) {
        return (dato != null) ? dato.toString() : "null";
    }

    // Convierte una cadena de texto a un tipo de dato específico
    public Object convertirSalida(String mensaje, Class<?> tipo) {
        if (tipo == Integer.class) {
            try {
                return Integer.parseInt(mensaje);
            } catch (NumberFormatException e) {
                return "Error: No es un número entero válido";
            }
        } else if (tipo == Double.class) {
            try {
                return Double.parseDouble(mensaje);
            } catch (NumberFormatException e) {
                return "Error: No es un número decimal válido";
            }
        } else if (tipo == Boolean.class) {
            return mensaje.equalsIgnoreCase("true") || mensaje.equals("1");
        } else if (tipo == String.class) {
            return mensaje;
        }
        return "Error: Tipo de dato no soportado";
    }
}

