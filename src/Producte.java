/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author batoi
 */
public class Producte implements Comparable<Producte> {
    private final String identificador;
    private double preu;
    private final Marca marca;

    public Producte(String identificador, double preu, Marca marca) {
        assert preu >= 0 : "El preu no pot ser negatiu";
        this.identificador = identificador;
        this.preu = preu;
        this.marca = marca;
    }

    public String getIdentificador() { return identificador; }
    public double getPreu() { return preu; }
    public Marca getMarca() { return marca; }

    public void setPreu(double preu) {
        assert preu >= 0 : "El preu no pot ser negatiu";
        this.preu = preu;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Producte other) {
            return this.identificador.equals(other.identificador);
        }
        return false;
    }

    @Override
    public int compareTo(Producte p) {
        return this.identificador.compareTo(p.identificador);
    }

    @Override
    public String toString() {
        return identificador + " - " + preu + "€";
    }
}
