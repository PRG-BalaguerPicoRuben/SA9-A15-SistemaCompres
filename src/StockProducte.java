
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author batoi
 */
public class StockProducte {
    private Producte producte;
    private int unitats;

    public StockProducte(Producte producte, int unitats) {
        assert unitats >= 0 : "Unitats no pot ser negatiu";
        this.producte = producte;
        this.unitats = unitats;
    }

    public Producte getProducte() { return producte; }
    public int getUnitats() { return unitats; }

    public void decrementarUnitats(int quantitat) {
        unitats -= quantitat;
    }

    public boolean estaDisponible() {
        return unitats > 0;
    }
}
