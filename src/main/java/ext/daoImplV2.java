package ext ;

import dao.idao;

public class daoImplV2 implements idao {
    @Override
    public double getData() {
        System.out.println("Version web service ");
        double t=11;
        return t;
    }
}
