package methode;

class PentagonaNumberKnjiga {
    public static void calculated() {
        final int NUMBER_OF_PENTAGONALS = 100;
        System.out.println("The first pentagonals numbers: ");

        for (int i = 1; i <= NUMBER_OF_PENTAGONALS; i++) {
            if (i % 10 == 0) {
                System.out.printf("%7d\n", getPentagonalNumber(i));
            } else {
                System.out.printf("%7d", getPentagonalNumber(i));
            }
        }
        //vrati pentagonalni broj

    }

    private static int getPentagonalNumber(int i) {
        return (i * (3 * i - 1)) / 2;
    }
}
