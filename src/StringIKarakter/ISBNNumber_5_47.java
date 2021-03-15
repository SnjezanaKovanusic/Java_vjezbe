package StringIKarakter;

public class ISBNNumber_5_47 {
    /*(Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. It
uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
which is calculated from the other digits using the following formula:
10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
 If the checksum is 10, replace it with 0. Your program should read the input as a
string.*/
    public static void main(String[] args) {
        String iSBNumber = "978013213080";
        int parni = 0;
        int neparni = 0;
        int suma;


        for (int i = 0; i < iSBNumber.length(); i++) {

            if (i % 2 == 0) {
                neparni += (Integer.parseInt(String.valueOf(iSBNumber.charAt(i))));

            } else {
                parni += 3 * (Integer.parseInt(String.valueOf(iSBNumber.charAt(i))));

            }
        }
        suma = 10 - (parni + neparni) % 10;
        if (suma == 10) {
            iSBNumber += "0";
            System.out.println(iSBNumber);
        } else {
            iSBNumber += suma;
            System.out.println(iSBNumber);
        }

    }
}
