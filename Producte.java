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
        assert identificador != null && !identificador.isEmpty() : "L'identificador no pot ser null o buit";
        assert preu > 0 : "El preu ha de ser positiu";
        assert marca != null : "La marca no pot ser null";
        
        this.identificador = identificador;
        this.preu = preu;
        this.marca = marca;
    }
    
    public String getIdentificador() {
        return identificador;
    }
    
    public double getPreu() {
        return preu;
    }
    
    public void setPreu(double preu) {
        assert preu > 0 : "El preu ha de ser positiu";
        this.preu = preu;
    }
    
    public Marca getMarca() {
        return marca;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producte producte = (Producte) obj;
        return identificador.equals(producte.identificador);
    }
    
    @Override
    public int hashCode() {
        return identificador.hashCode();
    }
    
    public int compareTo(Producte altre) {
        return this.identificador.compareTo(altre.identificador);
    }
    
    @Override
    public String toString() {
        return identificador + " (" + marca + ") - " + preu + "€";
    }
    
    
}
