
import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("\nTop 25 based on penalty amounts:\n");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("\nSidney Crosby's stats:\n");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("\nPhiladelphia Flyers stats:\n");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("\nPLayers in Anaheim Ducks:\n");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
