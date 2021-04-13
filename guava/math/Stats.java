package guava.math;

public class Stats {
    public static double meanOf(double... values){
        double sum = 0.0;
        for (int i = 0; i < values.length; i++){
           sum += values[i];
        }

        return sum/values.length;
    }
}
