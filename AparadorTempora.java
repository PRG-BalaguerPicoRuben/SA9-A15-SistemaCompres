/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa9.a15.sistemacompres;

import java.util.ArrayList;

/**
 *
 * @author batoi
 */
public class AparadorTempora extends Aparadors{ 

    public boolean obert;
    
    public AparadorTempora(String nom, Marca marca, ArrayList<StockProducte> Stock){
        super(nom, marca, Stock);
        this.obert = obert;
    }
    
}
