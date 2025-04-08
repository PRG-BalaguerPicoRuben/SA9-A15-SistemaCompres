
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author batoi
 */
public class AparadorFinsFiExistencies extends Aparador {
    private boolean tancat = false;

    public AparadorFinsFiExistencies(String nom, Marca marca, List<Producte> productes) {
        super(nom, marca, productes);
    }

    public void tancar() {
        this.tancat = true;
    }

    @Override
    public boolean estaObert() {
        if (tancat) return false;
        for (StockProducte sp : estoc) {
            if (sp.estaDisponible()) return true;
        }
        return false;
    }
}

