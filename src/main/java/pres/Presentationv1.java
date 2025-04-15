package pres;

import dao.daoImpl;

public class Presentationv1 {
    public static void main(String[] args) {
        /*
        Injection des dépendances par instentiation statique
         */
        daoImpl d  = new daoImpl();
        metierImpl metier = new metierImpl(d); //Injection des dépendances via le constructeur
        // metier.setdao(d); //Injection via setter
        System.out.println("RES="+metier.calcul());
    }
}
