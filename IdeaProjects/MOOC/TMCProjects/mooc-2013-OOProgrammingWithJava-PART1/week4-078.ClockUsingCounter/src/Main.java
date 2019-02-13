


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("Seconds: ");
        int s = reader.nextInt();
        seconds.setValue(s);
        System.out.print("Minutes: ");
        int m = reader.nextInt();
        minutes.setValue(m);
        System.out.print("Hours: ");
        int h = reader.nextInt();
        hours.setValue(h);


        int i = 0;
        while (i < 86405) {
            System.out.println(hours + ":" + minutes + ":" + seconds);   // the current time printed


            if (minutes.getValue() == 59 && seconds.getValue()==59) {
                hours.next();
            }
            if(seconds.getValue() == 59) {
                minutes.next();
            }
            seconds.next();
            // advance minutes
            // if minutes become zero, advance hours
            i++;
        }
    }
}
//        BoundedCounter counter = new BoundedCounter(4);
//        System.out.println("Value at start: " + counter);
//
//        int i = 0;
//        while (i < 10) {
//            counter.next();
//            System.out.println("Value: " + counter);
//            i++;
//        }
//    }
//}

        /*78.3*/
 //       Scanner reader = new Scanner(System.in);

//        BoundedCounter hours = new BoundedCounter(23);
//        BoundedCounter minutes = new BoundedCounter(59);
//        BoundedCounter seconds = new BoundedCounter(59);

//        System.out.print("seconds: ");
//        int s = reader.nextInt();
//        seconds.setValue(s);
//
//        System.out.print("minutes: ");
//        int m = reader.nextInt();
//        minutes.setValue(m);
//
//        System.out.print("hours: ");
//        int h = reader.nextInt();
//        hours.setValue(h);

//        int i = 0;
//        while (i < 121) {
//            System.out.println(hours + ":" + minutes /*+ ":" + seconds*/);
//            minutes.next();
////            if (i == 0) {
////                System.out.println("Value at start: " + hours + ":" + minutes /*+ ":" + seconds*/);
////            }
///*            seconds.next();
//            if (seconds.getValue() > seconds.getUpperLimit()) {
//                minutes.next();
//                seconds.setValue(0);
//            }*/
//            if (minutes.getValue() > minutes.getUpperLimit() /*&& seconds.getValue()==0*/) {
//                hours.next();
////                minutes.setValue(0);
//            }
//            if (hours.getValue() > hours.getUpperLimit() && minutes.getValue()==0) {
//                hours.setValue(0);
//            }
////                minutes.setValue(0);
////            }
////            else if(seconds.getValue()==0 && minutes.getValue()==0){
////                minutes.next();
////            }
////            System.out.println(hours + ":" + minutes /*+ ":" + seconds*/);
//            i++;
//        }
//    }
//}

// write here code to ensure that LimitedCounter works as expected
// before starting 78.3 remove the extra code and use the skeleton shown
// in the assignment




