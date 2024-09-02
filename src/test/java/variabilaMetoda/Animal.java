package variabilaMetoda;


import org.testng.annotations.Test;

public class Animal {

    public String rasa;
    public boolean esteMamifer;
    public String culoare;
    public int varsta;
    public double greutate;

    @Test

    public void metodaTest () {


        prezentareAnimal("caine", true, "maro", 2, 20.1);

        //prezentareAnimal("pisica", true, "alb", 3, 4.5);

    }

    public void prezentareAnimal (String param1, boolean param2, String param3, int param4, double param5) {

        System.out.println("Rasa animalului este " + param1);
        System.out.println("Animalul este mamifer? " + param2);
        System.out.println("Culoarea animalului este " + param3);
        System.out.println("Varsta animalului este " + param4);
        System.out.println("Greutatea animalului este " + param5);
        System.out.println("\n");

    }

}
