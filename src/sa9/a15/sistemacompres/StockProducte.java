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
    private Producte producto;

    public StockProducte(Producte producto) {
        this.unidades = generarRandom();
        this.producto = producto;
    }
    
    public static int generarRandom(){
        Random random = new Random();
        return random.nextInt(1,10);
    }
    
    
    
}
