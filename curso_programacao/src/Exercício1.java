import java.util.Locale;

//First fixation exercise
public class Exercício1 {

    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
        String product1 = "Computer";
        String product2 = "Office desk.";

        int age = 37;
        int code = 5290;
        char gender = 'f';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1 );
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);

        System.out.println("Record:" + age + " years old " + "code " + code + " and gender: " + gender);
        System.out.printf("Measure with eigth decimal places: %.8f%n", measure);

        System.out.printf("Rou (Three decimal places ): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point = %.3f%n", measure);
    }
}
