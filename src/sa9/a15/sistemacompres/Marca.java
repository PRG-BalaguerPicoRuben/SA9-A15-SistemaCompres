/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa9.a15.sistemacompres;

/**
 *
 * @author batoi
 */
public enum Marca {
    PEPE_WEAR("PepeWear"),
    LA_COSTERA("LaCostera"),
    FLOR_DEL_TARONGER("Flor del taronger");
    
    private final String nom;
    
    private Marca(String nom) {
        this.nom = nom;
    }
    
    @Override
    public String toString() {
        return nom;
    }
}
