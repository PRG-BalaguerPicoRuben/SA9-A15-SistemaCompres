/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa9.a15.sistemacompres;
import java.util.Random;

/**
 *
 * @author batoi
 */
public class StockProducte {
    
    private int unidades;
    private final Producte producto;

     public StockProducte(Producte producto, int unidades) {
        assert producto != null : "El producte no pot ser null";
        assert unidades >= 0 : "La quantitat no pot ser negativa";
        
        this.producto = producto;
        this.unidades = unidades;
    }
    
    public int getQuantitat() {
        return unidades;
    }
    
    public void decrementarQuantitat(int quantitat) {
        assert quantitat > 0 : "La quantitat a decrementar ha de ser positiva";
        assert this.unidades >= unidades : "No hi ha suficient estoc";
        
        this.unidades -= quantitat;
    }
    
    public Producte getProducte() {
        return producto;
    }
    
    public boolean teEstoc() {
        return unidades > 0;
    }
    
    
    
}
