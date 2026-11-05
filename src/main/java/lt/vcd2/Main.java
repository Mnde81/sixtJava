package lt.vcd2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void padidinkVienetu(int[] sk) {
        sk[0]++;

    }

    public static void pastumkTaska(Koordinates point) {
        point.x=point.x +10;

    }





    public static void main() {

       int[] sk={10};
       System.out.println(sk[0]);

       padidinkVienetu(sk);

        System.out.println(sk[0]);

        Koordinates point= new Koordinates();
        point.x=5;
        point.y=6;

        pastumkTaska(point);

        System.out.println(point.x+ " "+ point.y);
    }
}
