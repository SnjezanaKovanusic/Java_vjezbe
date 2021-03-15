package loops;

import java.util.Random;

public class SimuliranjeBacanjaKovanice {
    public static void main(String[] args) {
        Random random = new Random();

        int brojacPismo = 0;
        int brojacGlava = 0;
        for (int i = 0; i < 10; i++) {
            int simuliranje = random.nextInt(2);
            if (simuliranje == 0) {
                brojacPismo++;

            } else {
                brojacGlava++;
            }
        }
        System.out.println("Pismo = " + brojacPismo + " Glava= " + brojacGlava);
    }
}
