package tema1;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Tema2 {

    @Test

    public void metodaTest(){

//        ex1("DA ");
//        ex2(3);
//        ex3(15, 20);
//        ex4(4.5f, 3.25f);
//        ex5(10);
//        ex6(10);
//        ex7(50);
//        ex9();
//        ex10();
        ex11();


    }

    public void ex1(String da){

        System.out.print(da.repeat(5));

    }

    public void ex2(int capat){

        for (int index = 1; index <= capat; index++){
            System.out.println(index);
        }

    }

    public void ex3(int var1, int var2){

        if (var1 > var2){

            System.out.println("Numarul " + var1 + " este mai mare");

        } else if (var2 > var1) {

            System.out.println("Numarul " + var2 + " este mai mare");

        }

        else {

            System.out.println("Numerele sunt egale");

        }

    }

    public void ex4 (float var1, float var2){

        if (var1 < var2){

            System.out.println("Numarul " + var1 + " este mai mic");

        } else if (var2 < var1) {

            System.out.println("Numarul " + var2 + " este mai mic");

        }

        else {

            System.out.println("Numerele sunt egale");

        }

    }

    public void ex5(int capat){

        for (int index = 0; index <= capat; index++ ){

            if (index % 2 != 0){

                System.out.println(index);

            }

        }

    }

    public void ex6(int capat){

        for (int index = 0; index <= capat; index++ ){

            if (index % 2 == 0){

                System.out.println(index);

            }

        }

    }

    public void ex7(int capat){

        for (int index = 0; index <= capat; index++ ){

            if (index % 5 == 0){

                System.out.println(index);

            }

        }

    }

    public void ex9(){

        int var1 = 235;
        int var2 = 10;

        System.out.println( var1 + var2);

    }

    public void ex10(){

        int suma = 0;

        for (int var = 0; var <= 10; var++){

            suma = suma +var;
            System.out.println(suma);

        }

    }

    public void ex11(){

        int produs = 1;

        for (int var = 1; var <= 5; var++){

            produs = produs * var;
            System.out.println(produs);

        }

    }

}
