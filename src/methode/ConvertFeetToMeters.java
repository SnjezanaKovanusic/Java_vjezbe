package methode;

public class ConvertFeetToMeters {
    public static double footToMeter (double foot){
        double meter = 0.305 * foot;
        return meter;
    }
    public static double meterToFoot (double meter){
        double foot = 3.279 * meter;
        return foot;
    }
    public static void ispis (){
        double metri = 15.0;
        int count = 0;
        System.out.println("feet"       +   "meters"     + "|" +    "meters" +    "feet"+ "\n" +
                "-------------------------------------------------------------------");
        for (double feet = 1; feet<10; feet++ ){
            metri= metri+5.0;
            count++;
            System.out.print(feet +" "+ meterToFoot(metri)+ metri+" " +footToMeter(feet)+" "+(count%2==0?"\n ": " "));

        }
    }
}
