
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
public class AparadorTemporal extends Aparador {
    private final long tempsFi;

    public AparadorTemporal(String nom, Marca marca, List<Producte> productes, int dies) {
        super(nom, marca, productes);
        this.tempsFi = System.currentTimeMillis() + dies * 86400000L;
    }

    public long diesRestants() {
        long restant = (tempsFi - System.currentTimeMillis()) / 86400000L;
        return Math.max(restant, 0);
    }

    @Override
    public boolean estaObert() {
        return System.currentTimeMillis() < tempsFi;
    }
}

