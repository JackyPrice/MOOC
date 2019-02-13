import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;

    public Person(String name) {
        this.name = name;
        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);
        this.birthday=new MyDate(day, month, year);
    }

    public Person(String name, MyDate date) {
        this.name = name;
        this.birthday = date;
    }
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }


    public int age() {

//        MyDate today = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH),Calendar.getInstance().get(Calendar.YEAR));

// calculate the age based on the birthday and the current day
        // you get the current day as follows:
        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);
        MyDate today = new MyDate(day, month, year);
        return birthday.differenceInYears(today);
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays

        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);
        MyDate today = new MyDate(day, month, year);
//        compared.birthday.differenceInDays(today);

        System.out.println(compared.birthday.differenceInDays(today));
        System.out.println(this.birthday.differenceInDays(today));
        if (compared.birthday.differenceInDays(today) < this.birthday.differenceInDays(today)) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
