
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
public class AparadorTemporalFiExistencies extends AparadorTemporal {

    public AparadorTemporalFiExistencies(String nom, Marca marca, List<Producte> productes) {
        super(nom, marca, productes, 3);
    }

    @Override
    public boolean estaObert() {
    boolean hiHaEstoc = estoc.stream().anyMatch(StockProducte::estaDisponible);
    return super.estaObert() && hiHaEstoc;
}

}
