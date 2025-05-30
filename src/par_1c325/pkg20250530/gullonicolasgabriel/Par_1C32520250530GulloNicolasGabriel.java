/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par_1c325.pkg20250530.gullonicolasgabriel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gullito
 */
public class Par_1C32520250530GulloNicolasGabriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Nave>listaNaves = new ArrayList<>();
        AgenciaEspacial agencia = new AgenciaEspacial("AGENCIA ESPACIAL N°1", listaNaves);
        
        int opcion;
        do{
            System.out.println("=== MENU DE GESTION DE EXPEDICIONES ESPACIALES ===");
            System.out.println("1. Agregar nave");
            System.out.println("2. Mostrar las naves");
            System.out.println("3. Iniciar mision de exploracion");
            System.out.println("4. Mostrar naves ordenadas por nombre");
            System.out.println("5. Mostrar naves ordenadas por año de lanzamiento desc");
            System.out.println("6. Mostrar naves ordenadas por capacidad de tripulacion descendente");
            System.out.println("7. Salir del Sistema");
            opcion = Entrada.sc.nextInt();
            switch (opcion){
                case 1:
                    agencia.cargarNave(agencia);
                    break;
                case 2:
                    agencia.mostrarNaves();
                    break;
                case 3:
                    agencia.iniciarExploracion();
                    break;
                case 4:
                    agencia.ordenarPorNombre();
                    break;
                case 5:
                    agencia.ordenarPorAñoDesc(new ComparadorPorAño());
                    break;
                case 6:
                    agencia.ordenarPorTripulacion(new ComparadorPorTripulacion());
                    break;
                case 7:
                    opcion = 0;
                    System.out.println("SALIENDO DEL SISTEMA...");
                default:
                        System.out.println("[ERROR] OPCION INVALIDA");
            }
        }while(opcion !=0);
    }
    
}
