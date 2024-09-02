package obiectConstructor;

import java.util.List;

public class Masina {

    //Constructor = are ca rol sa initializeze variabilele unei clase
    //Recunoastem un constructor intr-o clasa dupa numele acestuia
    //De cele mai multe ori constructorul este public
    //Intr-o clasa putem avea mai multi constructori care se diferentiaza prin numarul/tipul de parametrii
    //O clasa contine intotdeauna un constructor DEFAULT (nu are parametrii)
    //Constructorii pot fii de doua tipuri: cu parametrii/ fara parametrii

    //Obiect = instanta unei clase
    //Dintr-o clasa putem sa definim mai multe obiecte care sa aibe valori diferite pentru proprietati
    //In momentul cand avem un obiect de tipul unei clase putem accesa variabile/ metode din clasa respectiva
    //Obiectele se diferentiaza prin numele acestora
    //Recunoastem un obiect dupa cuvantul cheie "new"
    //Structura: tipObiect numeObiect = new tipObiect (); - Masina Dacia = new Masina ();

    public String marca;
    public String model;
    public int an;
    public String culoare;
    public List<String> dotariInterioare;
    public String motorizare;
    public int pret;

    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare) {

        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
    }

    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareMasina(){
        System.out.println("Marca masinii este " +marca );
        System.out.println("Modelul  este " + model);
        System.out.println("Anul fabricatiei: " + an);
        System.out.println("Culoarea: " +culoare);
        System.out.println("Dotarile interioare sunt: ");
        for (int i = 0; i < dotariInterioare.size(); i++){
            System.out.println(dotariInterioare.get(i));
        }
        System.out.println("Motorizare: " + motorizare);
        if (pret != 0) {
            System.out.println("Pret: " + pret);
        }
        System.out.println(" ");
    }

    // determinam impozitul in functie de anul de fabricatie
    //<2000 - 500
    //2005- 2015
    //<2020 100


}
