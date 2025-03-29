
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */

public class EntradaConsola implements Entrada {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String ingresarDatos() {
        System.out.print("Ingrese datos por consola: ");
        return scanner.nextLine();
    }

    @Override
    public String ingresarDatos(Object dato, Adapter adaptador) {
        return adaptador.convertirEntrada(dato);
    }
}


