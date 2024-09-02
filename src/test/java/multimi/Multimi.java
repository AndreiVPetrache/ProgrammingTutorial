package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {

    //Multimi: array, list, set, map

    @Test

    public void metodaTest() {

        //cursantiArray();
        //cursantiList();
        //masiniArray();
        //mapExample();
        tariOrase();


    }


    //afisam cursantii de la cursul de automation

    public void cursantiArray() {

        String[] cursanti = new String[6];
        cursanti[0] = "Rares";
        cursanti[1] = "Cristina";
        cursanti[2] = "Magda";
        cursanti[3] = "Razvan";
        cursanti[4] = "Radu";
        cursanti[5] = "Andrei";

        for (int index = 0; index < cursanti.length; index++) {
            System.out.println("Numele cursantului este " + cursanti[index]);
        }

    }

    //v2 - list

    public void cursantiList() {

        List<String> cursanti = new ArrayList<>();
        cursanti.add("Rares");
        cursanti.add("Cristina");
        cursanti.add("Magda");
        cursanti.add("Razvan");
        cursanti.add("Radu");
        cursanti.add("Andrei");

        for (int index = 0; index < cursanti.size(); index++) {
            System.out.println("Numele cursantului este " + cursanti.get(index));
        }

    }

    //afisam o multime de masini

    public void masiniArray() {

        String[] masini = new String[5];
        masini[0] = "Honda";
        masini[1] = "Dacia";
        masini[2] = "Peugeot";
        masini[3] = "Porsche";
        masini[4] = "Ford";

        for (int index = 0; index < masini.length; index++) {

            if (index % 2 != 1) {
                System.out.println("Brand-ul masinii este " + masini[index]);
            }
        }

    }


    //Map: key = value
    //Parcurgerea se face pe baza cheilor (folosind un set)

    public void mapExample(){

        Map<String, String> elemente = new HashMap<>();
        elemente.put("masina", "Peugeot");
        elemente.put("persoana", "Rares");
        elemente.put("telefon", "Samsung");
        for (String key: elemente.keySet()){

            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + elemente.get(key));

        }

    }

    //Afisam tari cu anumite orase
    public void tariOrase(){

        Map<String, List<String>> obiecte = new HashMap<>();

        List<String> oraseRomania = Arrays.asList("Cluj", "Oradea", "Timisoara");
        List<String> oraseItalia = Arrays.asList("Roma", "Milan", "Turin");
        List<String> oraseSpania = Arrays.asList("Madrid", "Barcelona", "Valencia");

        obiecte.put("Romania", oraseRomania);
        obiecte.put("Italia", oraseItalia);
        obiecte.put("Spania", oraseSpania);

        for (String key: obiecte.keySet()){

            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " + obiecte.get(key));

        }

    }

    //ingrediente pentru retete



}
