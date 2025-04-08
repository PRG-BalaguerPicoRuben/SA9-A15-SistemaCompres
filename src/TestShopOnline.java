/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author batoi
 */
import java.util.*;

public class TestShopOnline {
    public static void main(String[] args) {
        // Crear productes
        Producte p1 = new Producte("P1", 10.5, Marca.PEPEWEAR);
        Producte p2 = new Producte("P2", 20.0, Marca.PEPEWEAR);
        Producte p3 = new Producte("P3", 15.75, Marca.PEPEWEAR);

        Producte p4 = new Producte("P4", 35.0, Marca.LACOSTERA);
        Producte p5 = new Producte("P5", 42.5, Marca.LACOSTERA);

        List<Producte> llista1 = Arrays.asList(p1, p2, p3);
        List<Producte> llista2 = Arrays.asList(p4, p5);

        // Crear aparadors
        Aparador ap1 = new AparadorFinsFiExistencies("Outlet Pepe", Marca.PEPEWEAR, llista1);
        Aparador ap2 = new AparadorTemporal("Promo Laco", Marca.LACOSTERA, llista2, 1);
        Aparador ap3 = new AparadorTemporalFiExistencies("Express Pepe", Marca.PEPEWEAR, llista1);

        List<Aparador> aparadors = Arrays.asList(ap1, ap2, ap3);

        // Mostrar productes disponibles
        System.out.println("Productes disponibles a cada aparador:");
        for (Aparador ap : aparadors) {
            System.out.println("🔸 " + ap.getClass().getSimpleName() + " - " + ap.nom);
            for (Producte p : ap.getProductesOrdenats()) {
                System.out.println("   ➤ " + p);
            }
        }

        // Intentar comprar un producte
        System.out.println("\n🛒Intentant comprar productes...");
        try {
            ap1.comprar(p1, 1); 
            ap2.comprar(p4, 2); 
            ap3.comprar(p2, 1); 
        } catch (ShowRoomNotOpenException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Forçar error: comprar producte que no existeix
        try {
            ap1.comprar(p5, 1); 
        } catch (ShowRoomNotOpenException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (NotExistEnoughtItemException e) {
            System.out.println("❌No hi ha estoc: " + e.getMessage());
        }

        // Tancar aparador i provar compra
        if (ap1 instanceof AparadorFinsFiExistencies af) {
            af.tancar();
            try {
                af.comprar(p2, 1); 
            } catch (ShowRoomNotOpenException e) {
                System.out.println("🚫No es pot comprar. Aparador tancat.");
            }
        }

        System.out.println("\n✅ Final de la simulació.");
    }
}

