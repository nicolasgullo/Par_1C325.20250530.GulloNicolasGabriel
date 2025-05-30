/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c325.pkg20250530.gullonicolasgabriel;

/**
 *
 * @author Gullito
 */
public class Carguero extends Nave implements Explorador{
    private int capacidadCarga;

    public Carguero(int capacidadCarga, String nombreNave, int cantidadTripulantes, int anioLanzamiento) {
        super(nombreNave, cantidadTripulantes, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    @Override
    public String toString() {
        return "CARGUERO [ Nombre: " + nombreNave + ", Año de Lanzamiento: " + anioLanzamiento + ", Capacidad tripulacion: " + capacidadTripulacion + ", Capacidad Carga:" + capacidadCarga;
    }
    
    @Override
    public void explora() {
        System.out.println("Iniciando Exploracion con Nave: " + nombreNave);
    }
    
    
}
