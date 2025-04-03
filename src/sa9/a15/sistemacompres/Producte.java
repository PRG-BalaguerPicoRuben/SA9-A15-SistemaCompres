/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa9.a15.sistemacompres;

/**
 *
 * @author batoi
 */
public class Producte {
    
    private String identificador;
    private double preu;
    private Marca marca;

    public Producte(String identificador, double preu, Marca marca) {
        this.identificador = identificador;
        this.preu = preu;
        this.marca = marca;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
    
    
}
