package methode;

public class BrojacPismaUStringuSaCasa_6_20 {


    public static int countLetters (String s){
        int brojac = 0;
       for (int i = 0; i<s.length(); i++){
           if (Character.isLetter(s.charAt(i))){
               brojac++;
           }
       }
        return brojac;
    }
}
