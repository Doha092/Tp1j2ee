package pres;

import dao.daoImpl;
import metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            //daoImpl d  = new daoImpl();
            String daoClassName = scanner.nextLine();
            Class cdao= Class.forName(daoClassName);
            idao dao =(idao) cdao.getConstructor().newInstance();
            //metierImpl metier = new metierImpl(d);
            String metierClassName = scanner.nextLine();
            Class cmetier = Class.forName(metierClassName);
            Imetier metier =(Imetier) cmetier.getConstructor().newInstance();
            // metier.setdao(d);
            methode setdao =cmetier.getDeclaredMethod("setdao",Idao.Class);
            setdao.invoke(metier,dao);

            System.out.println("RES="+metier.calcul());
        } catch (Exception e) {
            System.out.println(e.getMessage());

    }
    }
}