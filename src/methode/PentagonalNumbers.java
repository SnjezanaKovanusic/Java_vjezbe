package methode;

public class PentagonalNumbers {
    public static void main(String[] args) {
        final int PENTAGONAL_NUMBERS = 100;
        int counter = 0;
        for (int i = 1; i < PENTAGONAL_NUMBERS; i++) {
            counter++;
            if (counter % 10 == 0) {
                System.out.print(getPentagonalNumber(i) + "\n");
            } else {
                System.out.print(getPentagonalNumber(i) + " ");
            }

        }
    }

    public static int getPentagonalNumber(int n) {
        int pentagonalNumber = n * (3 * n - 1) / 2;
        return pentagonalNumber;
    }
}
