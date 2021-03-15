package methode;

public class SortThreeNumbers {
    public static void main(String[] args) {
        // System.out.println("Enter three numbers: ");
        int numberOne = 5;
        int numberTwo = 3;
        int numberThree = 10;

        displaySortedNumbers(numberOne, numberTwo, numberThree);
    }

    public static void displaySortedNumbers(int one, int two, int three) {
        int temperatly;

             if (one>two){
                temperatly=two;
                two = one;
                one = temperatly;
            }

            if (two > three){
                temperatly= three;
                three= two;
                two = temperatly;
            }
            if (one>two&&three>one){
                temperatly= one;
                one=two;
                two=temperatly;
            }

        System.out.println(one + " " + two + " " + three);
    }
}
