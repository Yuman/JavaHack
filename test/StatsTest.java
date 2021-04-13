package test;
import guava.math.Stats;
public class StatsTest {
    public static void main(String[] args){
        double m = Stats.meanOf(1.1, 2.2, 3.3);
        System.out.println(m);
    }
}
