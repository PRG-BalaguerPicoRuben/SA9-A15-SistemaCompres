
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author batoi
 */
import java.util.*;

public abstract class Aparador {
    protected String nom;
    protected Marca marca;
    protected List<StockProducte> estoc;

    public Aparador(String nom, Marca marca, List<Producte> productes) {
        this.nom = nom;
        this.marca = marca;
        this.estoc = new ArrayList<>();

        for (Producte p : productes) {
            if (p.getMarca() != marca) {
                throw new CanNotMergeBrandsException("Tots els productes han de ser de la mateixa marca que l'aparador.");
            }
            int unitats = (int) (Math.random() * 10) + 1;
            estoc.add(new StockProducte(p, unitats));
        }
    }

    public List<Producte> getProductesDisponibles() {
        List<Producte> disponibles = new ArrayList<>();
        for (StockProducte sp : estoc) {
            if (sp.estaDisponible()) {
                disponibles.add(sp.getProducte());
            }
        }
        return disponibles;
    }

    public List<Producte> getProductesOrdenats() {
        List<Producte> ordenats = getProductesDisponibles();
        Collections.sort(ordenats);
        return ordenats;
    }

    public boolean estaDisponible(String identificador, int quantitat) {
        for (StockProducte sp : estoc) {
            if (sp.getProducte().getIdentificador().equals(identificador)) {
                return sp.getUnitats() >= quantitat;
            }
        }
        return false;
    }

    public boolean estaEnEstoc(Producte producte) {
        for (StockProducte sp : estoc) {
            if (sp.getProducte().equals(producte)) {
                return sp.getUnitats() > 0;
            }
        }
        return false;
    }

    public int getUnitatsDisponibles(Producte producte) {
        for (StockProducte sp : estoc) {
            if (sp.getProducte().equals(producte)) {
                return sp.getUnitats();
            }
        }
        return 0;
    }

    public void comprar(Producte producte, int quantitat) throws ShowRoomNotOpenException {
        if (!estaObert()) {
            throw new ShowRoomNotOpenException("L'aparador no està obert.");
        }
        for (StockProducte sp : estoc) {
            if (sp.getProducte().equals(producte)) {
                if (sp.getUnitats() < quantitat) {
                    throw new NotExistEnoughtItemException("No hi ha prou unitats del producte.");
                }
                sp.decrementarUnitats(quantitat);
                return;
            }
        }
        throw new NotExistEnoughtItemException("El producte no està en l'estoc.");
    }

    public abstract boolean estaObert();
}

