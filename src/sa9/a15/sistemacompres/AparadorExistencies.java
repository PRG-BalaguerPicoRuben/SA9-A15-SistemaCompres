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
public class AparadorExistencies extends Aparadors{
   private boolean obert;
   
   public AparadorExistencies(String nom, Marca marca, ArrayList<StockProducte> Stock){
        super(nom, marca, Stock);
        this.obert = true;
    }
   
   public void apagar(){
       obert = false;
   }
}
