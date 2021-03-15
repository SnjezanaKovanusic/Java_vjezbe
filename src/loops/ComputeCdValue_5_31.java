package loops;

public class ComputeCdValue_5_31 {
    public static void main(String[] args) {
        double cd = 10000;
        double percentagleYield = 5.75 / 1200;

        for (int i = 0; i < 3; i++) {

            cd += (cd * percentagleYield);


            System.out.println(cd);
        }
    }
}
