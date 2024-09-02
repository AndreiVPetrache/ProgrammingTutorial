package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //In programare exista doua tipuri de structuri: alternative si repetitive
    //Structuri alternative: if...then...else / switch...case /

    @Test

    public void metodaTest() {

        //verificaPersoanaMajora(22);
        //verificaPersoanaMajora(15);
        //verificaPersoanaMajora(18);

//        verificNrPar(2);
//        verificNrPar(7);
//        verificNrPar(0);
//        verificNrPar(-3);

        zileSaptamana(3);



    }

    //Facem o metoda care verifica daca o persoana e majora

    public void verificaPersoanaMajora(int varsta) {

        if (varsta >= 18) {
            System.out.println("Persoana cu varsta de " + varsta + " este majora");
        } else {
            System.out.println("Persoana cu varsta de " + varsta + " este minora");
        }


    }

    //Verificam daca un numar este par si pozitiv
    //Daca vrem catul unei impartiri / (div)
    //Daca vrem restul unei impartiri % (mod)

    public void verificNrPar(int nr) {

        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este pozitiv si par.");
            } else {
                System.out.println("Numarul " + nr + " este pozitiv si impar");
            }
        } else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este negativ si par.");
            } else {
                System.out.println("Numarul " + nr + " este negativ si impar");
            }

        } else {
            System.out.println("Numarul este zero");
        }
        }


        //Verificam daca un numar este pozitiv si divizibil cu 5

    public void verificNrDiv5(int nr) {

        if (nr % 5 == 0 && nr > 0) {

            System.out.println("Numarul " + nr + "este pozitiv si divizibil cu 5");
        } else {
            System.out.println("Numarul nu e divizibil cu 5");
        }

    }

    //Verficam zilele saptamanii

    public void zileSaptamana (int zi){
        switch (zi){
            case 1:
                System.out.println("Astazi e luni");
                break;
            case 2:
                System.out.println("Astazi e marti");
                break;
            case 3:
                System.out.println("Astazi e miercuri");
                break;
            case 4:
                System.out.println("Astazi e joi");
                break;
            case 5:
                System.out.println("Astazi e vineri");
                break;
            case 6:
                System.out.println("Astazi e sambata");
                break;
            case 7:
                System.out.println("Astazi e duminica");
                break;
            default:
                System.out.println("Nu mai sunt zile");
        }
    }


}
