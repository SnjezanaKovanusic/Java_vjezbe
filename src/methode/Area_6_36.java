package methode;

public class Area_6_36 {
    public static double area (int n, double side){
        double area;
        double djelilac = n* Math.pow(side, 2);
        double djeljenikPi = Math.PI/n;
        double djeljenik = 4* Math.tan(djeljenikPi);
        area = djelilac/djeljenik;
        return area;
    }
}
