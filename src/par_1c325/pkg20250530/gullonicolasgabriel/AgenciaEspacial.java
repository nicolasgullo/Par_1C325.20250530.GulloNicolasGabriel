/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c325.pkg20250530.gullonicolasgabriel;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Gullito
 */
public class AgenciaEspacial {
    private String nombreAgencia;
    private List<Nave> listaNaves;

    public AgenciaEspacial(String nombreAgencia, List<Nave> listaNaves) {
        this.nombreAgencia = nombreAgencia;
        this.listaNaves = listaNaves;
    }
    
    public void mostrarNaves(){
        System.out.println("=== NAVES EN LA AGENCIA ===");
        for (Nave p : listaNaves){
            System.out.println(p.toString());
        }
    }
    
    public void agregarNave(Nave nave){
        if (listaNaves.contains(nave)){
            System.out.println("Ya existe esa nave.");    
        }else {
            listaNaves.add(nave);
            System.out.println("Nave agregada: " + nave.getNombreNave());
        }
    }
    
    public void iniciarExploracion (){
     System.out.println("=== INICIANDO EXPLORACION ===");
        for (Nave nave : listaNaves){
            if (nave instanceof Explorador explorador){
                explorador.explora();
            }else {
                System.out.println("Esta nave no puede explorar : " + nave.getNombreNave());
            }
        }
    }
    
    public void cargarNave(AgenciaEspacial agencia){
        int opcion;
        do{
            System.out.println("=== NAVES ===");
            System.out.println("1. Exploracion");
            System.out.println("2. Carguero");
            System.out.println("3. Crucero Estelar");
            opcion = Entrada.sc.nextInt();
            Entrada.sc.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Nombre del Exploracion: ");
                    String nombreE = Entrada.sc.next();
                    int anioE = agencia.validarAnio();
                    System.out.println("Capacidad Tripulantes: ");
                    int capacidadTripulanteE = Entrada.sc.nextInt();
                    String misionValida = agencia.elegirMision();
                    agencia.agregarNave(new Exploracion(nombreE, anioE, capacidadTripulanteE, misionValida));
                    opcion = 0;
                    break;
                case 2:
                    System.out.println("Nombre del Carguero: ");
                    String nombreC = Entrada.sc.next();
                    int anioC = agencia.validarAnio();
                    System.out.println("Capacidad Tripulantes: ");
                    int capacidadTripulanteC = Entrada.sc.nextInt();
                    System.out.println("Capacidad de Carga (100 a 500): ");
                    int carga = Entrada.sc.nextInt();

                    if (carga < 100) {
                        carga = 100;
                        System.out.println("CARGA SETEADA EN 100.");
                    } else if (carga > 500) {
                        carga = 500;
                        System.out.println("CARGA SETEADA EN 500.");
                  
                    } else{
                        System.out.println("CARGA SETEADA EN: " + carga);
                    }
                        agencia.agregarNave(new Carguero(carga, nombreC, capacidadTripulanteC, anioC));
                    opcion = 0;
                    break;
                case 3:
                    System.out.println("Nombre del Crucero Estelar: ");
                    String nombreCE = Entrada.sc.next();
                    int anioCE = agencia.validarAnio();
                    System.out.println("Cantidad Tripulantes: ");
                    int capacidadTripulacionCE = Entrada.sc.nextInt();
                    System.out.println("Cantidad de pasajeros: ");
                    int cantidadPasajerosCE = Entrada.sc.nextInt();
                    agencia.agregarNave(new CruceroEstelar(nombreCE, anioCE, capacidadTripulacionCE, cantidadPasajerosCE));
                    opcion= 0;
                    break;
                default:
                    System.out.println("[ERROR] OPCION NO VALIDA.");                        
            }
        }while(opcion !=0);
    }
    
    public String elegirMision(){
        String misionElegida = null;
        int opcion;
        do{
            System.out.println("=== TIPOS MISIONES ===");
            System.out.println("1. CARTOGRAFIA");
            System.out.println("2. INVESTIGACIÓN");
            System.out.println("3. CONTACTO");
            opcion = Entrada.sc.nextInt();
            Entrada.sc.nextLine();
            switch (opcion){
                case 1:
                    misionElegida =" CARTOGRAFIA";
                    opcion = 0;
                    break;
                case 2:
                    misionElegida = " INVESTIGACIÓN";
                    opcion = 0;
                    break;
                case 3:
                    misionElegida = " CONTACTO";
                    opcion = 0;
                    break;
                default:
                        System.out.println("[ERROR] OPCION NO VALIDA.");
            }
        }while(opcion !=0);
        return misionElegida;
        }
    
    public void ordenarPorNombre(){
        Collections.sort(listaNaves);
        mostrarNaves();
    }
    
    public void ordenarPorAñoDesc(Comparator comparador){
        Collections.sort(listaNaves, comparador);
        mostrarNaves();
    }
    
    public void ordenarPorTripulacion(Comparator comparador){
        Collections.sort(listaNaves, comparador);
        mostrarNaves();
    }
    public int validarAnio(){
        System.out.println("Año de lanzamiento: ");
        int anio = Entrada.sc.nextInt();
       
        if (anio < 0){
            while (anio < 0){
            System.out.println("Año invalido, ingrese nuevamente: ");
            anio = Entrada.sc.nextInt();
            }
        }else{
            return anio;
        }
        return anio;
    }
    
}
    
    
    
    
    
    
