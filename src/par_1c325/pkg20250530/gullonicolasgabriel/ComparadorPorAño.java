/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c325.pkg20250530.gullonicolasgabriel;

import java.util.Comparator;

/**
 *
 * @author Gullito
 */
public class ComparadorPorAño implements Comparator<Nave>{

    @Override
    public int compare(Nave nave1, Nave nave2) {
        return Integer.compare(nave2.getAnioLanzamiento(),nave1.getAnioLanzamiento());    }
    
}
