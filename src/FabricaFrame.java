/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class FabricaFrame implements Fabrica{
    @Override
    public Entrada crearEntrada() {
        return new EntradaFrame();
    }
    
    @Override
    public Salida crearSalida() {
        return new SalidaFrame();
    }
}
