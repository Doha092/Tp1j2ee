package dao;

public class daoImpl implements idao {
    @Override
    public double getData() {
        system.out.println("Version bases de données");
        double temp = 23;
        return temp;
    }
}
