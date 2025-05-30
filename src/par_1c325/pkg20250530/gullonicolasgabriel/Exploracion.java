/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c325.pkg20250530.gullonicolasgabriel;

/**
 *
 * @author Gullito
 */
public class Exploracion extends Nave implements Explorador{
    private String tipoMision;

    public Exploracion(String nombreNave, int anioLanzamiento, int capacidadTripulacion, String tipoMision) {
        super(nombreNave, anioLanzamiento, capacidadTripulacion);
        this.tipoMision = tipoMision;
    }

    public String getTipoMision() {
        return tipoMision;
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
        return "EXPLORACION [ Nombre: " + nombreNave + ", Año de Lanzamiento: " + anioLanzamiento + ", Capacidad tripulacion: " + capacidadTripulacion + ", Tipo de Mision:" + tipoMision;
    }

    @Override
    public void explora() {
        System.out.println("Iniciando Exploracion con Nave: " + nombreNave);
    }
    
}
