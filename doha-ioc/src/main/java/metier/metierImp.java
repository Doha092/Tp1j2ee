package metier;

import dao.daoImpl;
import dao.idao;

public class metierImp implements Imetier{
    //couplage faible
    private idao dao;

    pulic metierImp() {
    }


    public metierImp(idao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 23;
        return res;
    }

    /**
     *Pour Injecter dans la variable dao  un objet
     * d'une classe qui implémente l'interface idao
     */ d
    public void setDao(idao dao) {
        this.dao = dao;
    }
}
