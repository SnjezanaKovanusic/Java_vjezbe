package StringIKarakter;

public class CommonPrefix_5_51 {
    public static void main(String[] args) {
        String frazaPrva = "Veceras je lijepo";
        String frazaDruga = "Veceras je divnoooooooo";
        String prefiks = "";
        int minDuzina = Math.min(frazaPrva.length(), frazaDruga.length());

        for (int i = 0; i < minDuzina; i++) {

            if (frazaPrva.charAt(i) == frazaDruga.charAt(i)) {
                prefiks += frazaPrva.charAt(i);

            } else {

                break;
            }

        }
        if (prefiks.equals("")) {
            System.out.println("Nema podudaranja");
        }
        System.out.println(prefiks);
    }

}

