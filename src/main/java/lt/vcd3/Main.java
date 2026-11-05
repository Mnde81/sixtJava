package lt.vcd3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void isvedimas(int x) {

        if (x!=1) {
            isvedimas(x-1);
        }
        System.out.print(x+" ");


    }

    public static int faktorialas(int x) {
       if (x==1) {
           return 1;
       }else{
           return x * faktorialas(x-1);
       }
    }


    static void main() {

        isvedimas(30);

        System.out.println("\n"+faktorialas(5));  // 5! = 5*4*3*2*1



    }
}
