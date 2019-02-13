
public class Main {

    public static void main(String[] args) {
        // Test your code here
        NightSky nightSky = new NightSky(0.3,10,1);
//        nightSky.printLine();
        nightSky.print();
        System.out.println("stars in last print: " + nightSky.starsInLastPrint());
    }


}
