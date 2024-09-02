package tema;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public int numarUsi;
    public String tipMotor;
    public float capacitateCilindrica;
    public char tipCombustibil;
    public boolean areTurbina;
    public double pret;

    @Test
    public void metodaTest () {

       //marca = "Honda";
       //model = "Civic";
       //numarUsi = 2;
       //tipMotor = "inline 4";
       //capacitateCilindrica = 1.4f;
       //tipCombustibil = 'B';
       //areTurbina = false;
       //pret = 2500.96;

       prezentareMasina("Honda", "Civic", 2, "inline 4", 1.4f, 'B', false, 2500.96);

       System.out.println("");

       prezentareMasina("Porsche", "987 Cayman", 2, "flat 6", 2.7f, 'B', false, 25000);

       System.out.println("");

       prezentareMasina("Toyota", "Camry", 4, "inline 4", 2.5f, 'H', false, 14500.45);

    }

    public void prezentareMasina (String param1, String param2, int param3, String param4, float param5, char param6, boolean param7, double param8) {

        System.out.println("Marca masinii este " + param1);
        System.out.println("Modelul masinii este " + param2);
        System.out.println("Masina are "+param3 + " usi");
        System.out.println("Masina are un motor " + param4);
        System.out.println("Capacitatea cilindrica a motorului este de " + param5+" litri");
        System.out.println("Motorul functioneaza cu urmatorul tip de combustibil " + param6);
        System.out.println("Motorul are turbina? " + param7);
        System.out.println("Pretul masinii este de " + param8 + " euro");

    }

}
