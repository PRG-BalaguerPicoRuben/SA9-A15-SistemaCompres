/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sa9.a15.sistemacompres;
import java.util.ArrayList;
/**
 *
 * @author batoi
 */
public abstract class Aparadors {
    private String nom;
    private Marca marca;
    private ArrayList<StockProducte> Stock;

    public Aparadors(String nom, Marca marca, ArrayList<StockProducte> Stock) {
        this.nom = nom;
        this.marca = marca;
        this.Stock = Stock;
    }
    
    
    
}
