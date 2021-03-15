package methode;

public class ValidacijaSifre {
    public static boolean validiranj(String pasvord) {
        final int MIN_BROJ_KARAKTERA = 9;
        if (pasvord.length()<MIN_BROJ_KARAKTERA){
            System.out.println("nema dovoljno karakera");
            return false;
        }
        return true;
    }
}
