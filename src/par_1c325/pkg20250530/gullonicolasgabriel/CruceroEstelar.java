/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c325.pkg20250530.gullonicolasgabriel;

/**
 *
 * @author Gullito
 */
public class CruceroEstelar extends Nave{
    private int cantidadPasajeros;

    public CruceroEstelar(String nombreNave, int anioLanzamiento, int capacidadTripulacion, int cantidadPasajeros) {
        super(nombreNave, anioLanzamiento, capacidadTripulacion);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
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
        return "CRUCERO ESTELAR [ Nombre: " + nombreNave + ", Año de Lanzamiento: " + anioLanzamiento + ", Capacidad tripulacion: " + capacidadTripulacion + ", Cantidad de Pasajeros:" + cantidadPasajeros;
    }
}
