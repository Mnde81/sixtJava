package lt.vcd4;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void isveskKataloga(String katalogas){
        File f=new File(katalogas);
        String[] failai=f.list();
        for (int i=0; i<failai.length; i++) {
            File tmp= new File(katalogas+failai[i]);
            if (tmp.isDirectory()){
                isveskKataloga(katalogas+failai[i]+"/");
                System.out.print("D ");

            }else{
                System.out.print("F ");
                System.out.print(tmp.length()+" ");
            }
            System.out.println(katalogas +failai[i]);
        }

    }

    static void main() {
isveskKataloga("c:/tmp/");


    }
}
