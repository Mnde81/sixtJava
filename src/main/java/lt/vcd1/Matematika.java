package lt.vcd1;

public class Matematika {



    public static int pakeltiLaipsniu(int x, int laipsnis) {
        int rezultatas = x;
        for (int i=1; i < laipsnis; i++){
            rezultatas *=x;
        }
        return rezultatas;
    }

    public static double pakeltiLaipsniu(double x, int laipsnis) {
        double rezultatas = x;
        for (int i=1; i < laipsnis; i++){
            rezultatas *=x;
        }
        return rezultatas;
    }


    public static int pakeltiLaipsniu(int x) {
        return pakeltiLaipsniu(x, 2);
    }

    public static double pakeltiLaipsniu(double x) {
        return pakeltiLaipsniu(x, 2);
    }



}
