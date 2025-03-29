/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class FabricaConsola implements Fabrica{
    @Override
    public Entrada crearEntrada() {
        return new EntradaConsola();
    }
    
    @Override
    public Salida crearSalida() {
        return new SalidaConsola();
    }
}
