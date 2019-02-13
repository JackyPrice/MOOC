public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate
     * Copy the method here since it eases this assignment considerably.
     */

    public int differenceInYears(MyDate comparedDate) {

        int dayDifference = this.day - comparedDate.day;
        int monthDifference = (this.month - comparedDate.month) * 30;
        int yearDifference = this.year - comparedDate.year;
        int actualDifference = (yearDifference * 365 + (dayDifference + monthDifference)) / 365;

//        System.out.println("day: " + dayDifference);
//        System.out.println("month: " + monthDifference);
//        System.out.println("year: " + yearDifference);
//        System.out.println("year calculated: " + actualDifference);

        return Math.abs(actualDifference);

    }


    public int differenceInDays(MyDate comparedDate) {

        int dayDifference = this.day - comparedDate.day;
        int monthDifference = (this.month - comparedDate.month) * 30;
        int yearDifference = this.year - comparedDate.year;
        int actualDifference = (yearDifference * 365 + (dayDifference + monthDifference));

//        System.out.println("day: " + dayDifference);
//        System.out.println("month: " + monthDifference);
//        System.out.println("year: " + yearDifference);
//        System.out.println("year calculated: " + actualDifference);

        return Math.abs(actualDifference);

    }

}

//    public int differneceInYears(MyDate compared) {
//        return -99;
//    }
//
//
//}
 