package loops;

public class FindTheLargestN_5_13 {
    public static void main(String[] args) {
        // find the largest n such than n*3 <12000
        int n = 0;

        while (Math.pow(n+1, 3)< 12000) {
            n++;
        }
        System.out.println(n);
    }
}
