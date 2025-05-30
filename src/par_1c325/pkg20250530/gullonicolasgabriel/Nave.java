/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c325.pkg20250530.gullonicolasgabriel;

/**
 *
 * @author Gullito
 */
public abstract class Nave implements Comparable<Nave>{
    protected String nombreNave;
    protected int anioLanzamiento;
    protected int capacidadTripulacion;

    public Nave(String nombreNave, int anioLanzamiento, int capacidadTripulacion) {
        this.nombreNave = nombreNave;
        this.anioLanzamiento = anioLanzamiento;
        this.capacidadTripulacion = capacidadTripulacion;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return anioLanzamiento == nave.anioLanzamiento && nombreNave.equals(nave.nombreNave);
    }
    
    public abstract String toString();
    
    @Override
    public int compareTo(Nave nave){
       return this.nombreNave.compareTo(nave.nombreNave);
    }
    
    
}
