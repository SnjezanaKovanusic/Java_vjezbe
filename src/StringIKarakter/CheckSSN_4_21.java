package StringIKarakter;

public class CheckSSN_4_21 {
    /*(Check SSN) Write a program that prompts the user to enter a Social Security
number in the format DDD-DD-DDDD, where D is a digit. Your program should
check whether the input is valid*/
    public static void main(String[] args) {
        String socialNumber = "123-11-1349";
        boolean isValid = true;
        if (socialNumber.length() != 11) {
            System.out.println("Invalid size");
            isValid = false;
        } else {
            for (int i = 0; i < socialNumber.length(); i++) {

                if (i == 3 || i == 6) {
                    if (!(socialNumber.charAt(i) == '-')) {
                        System.out.println("Crtice ...");
                        isValid = false;
                        break;
                    }
                }
                if (!(i == 3 || i == 6)) {
                    if (!(Character.isDigit(socialNumber.charAt(i)))) {
                        System.out.println("invalid input on  position " + i + " must be number!");
                        isValid = false;
                        break;
                    }
                }
            }
        }

        if (isValid)
            System.out.println("validan unos");
    }
}

