package structuriRepetitive;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //Structuri repetitive: for/ while/ for each / do ... while

    @Test

    public void metodaTest() {

        //afisareNumereFor(10);
        //afisareNumereWhile(50);
        afisareNumerePare(50);

    }

    //afisam primele n numere

    public void afisareNumereFor (int capat) {

        for (int index = 0; index < capat; index++){

            System.out.println("Vreau sa afisez numarul " + index);
        }

    }

    public void afisareNumereWhile (int capat) {

        int index = 0;
        while (index < capat) {
            System.out.println("Vreau sa afisez numarul " + index);
            index++;
        }

    }

    //afisam numerele pare de la 0 la 50
    public void afisareNumerePare (int capat) {

        for (int index = 0; index <= capat; index++){

            if (index % 2 == 0){
                System.out.println("Numarul " +index+ " este par si mai mic decat 50");
            }

        }

    }

}
