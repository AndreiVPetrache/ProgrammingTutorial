package tema1;

import org.openqa.selenium.devtools.v85.dom.model.ShadowRootType;
import org.testng.annotations.Test;

public class Tema1 {

    @Test

    public void metodaTest(){

//        helloWorld(28, "Petrache", "Andrei");
//        salariuAndrei("Andrei", 1328.42f);
//        salariuAndrei("George", 1350.14f);
//        idAngajat(13, "HR", "Popescu");
//        idAngajat(15, "IT", "Grigore");
        idDept(300, "IT");
        idDept(20, "HR");

    }

    public void helloWorld(int varsta, String nume, String prenume){

        System.out.println("Hello, World!");
        System.out.println("Varsta mea este " + varsta);
        System.out.println("Numele meu este " + nume);
        System.out.println("Prenumele meu este " + prenume);
        System.out.println("Salut" + "M");
        System.out.println("H" + "Hello");

    }

    public void salariuAndrei(String prenume, float salariu){

        if (prenume == "Andrei"){

            System.out.println("Salariul angajatului " + prenume + " este de " + salariu + " lei.");

        }

        else {

            System.out.println("Salariul angajatului " + prenume + " este confidential.");

        }

    }

    public void idAngajat(int id, String dept, String nume){

        if (nume == "Popescu"){

            System.out.println("Angajatul " + nume + " cu ID " + id + " face parte din departamentul " + dept);

        }

        else {

            System.out.println("Datele angajatului " + nume + " sunt confidentiale.");

        }

    }

    public void idDept(int id, String dept){

        if (id > 287){

            System.out.println("Numele departamentului cu ID-ul " + id + " este " + dept);

        }

        else {

            System.out.println("ID-ul departamentului este prea mic");

        }

    }

}
