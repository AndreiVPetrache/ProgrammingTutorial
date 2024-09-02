package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MasinaTest {

    @Test
    public void testMasinaMethod(){

        Masina Dacia = new Masina("Dacia", "Logan", 2015, "Alb", Arrays.asList("- Aer conditionat", "- Airbag", "- Radio"), "Benzina");
        Dacia.prezentareMasina();

        Masina viitoare = new Masina("Kia", "Sportage", 2025, "albastru", Arrays.asList("- Aer conditionat", "- Airbag", "- Radio", "- Scaune incalzite"), "Benzina + Electric");
        viitoare.prezentareMasina();

        Masina viitoare1 = new Masina("Kia", "Sportage", 2020, "albastru", Arrays.asList("- Aer conditionat", "- Airbag", "- Radio", "- Scaune incalzite"), "Benzina + Electric", 25000);
        viitoare1.prezentareMasina();
    }


}
