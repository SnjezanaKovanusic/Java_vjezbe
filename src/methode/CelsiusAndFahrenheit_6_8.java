package methode;

public class CelsiusAndFahrenheit_6_8 {
    public static void main(String[] args) {


        System.out.println("Celsius         Farenheit  |     Farenheit           Celsijus");
        System.out.println("_____________________________________________________________");
        for (double celsius = 40.0, farenhejt = 120.0; celsius >= 31.0 && farenhejt>=30.0; celsius--, farenhejt -= 10) {
            System.out.println(celsius+"     ");
            System.out.println(celsiusToFahrenheit(celsius)+"   ");
            System.out.println(farenhejt+"    ");
            System.out.println(farenhajtToCelsijus(farenhejt)+"      ");
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double farenhajtToCelsijus(double farenhajt) {
        return (5.0 / 9) * (farenhajt - 32);
    }
}

