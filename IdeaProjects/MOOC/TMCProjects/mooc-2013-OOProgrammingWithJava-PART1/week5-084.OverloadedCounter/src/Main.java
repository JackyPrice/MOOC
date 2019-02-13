import jdk.nashorn.internal.codegen.CompileUnit;

public class Main {
    public static void main(String[] args) {
        // write testcode here

        Counter defaultCounter = new Counter();
        System.out.println(defaultCounter.toString());
        defaultCounter.decrease();
        System.out.println("after decrease: " + defaultCounter.toString());

        Counter checkCounter = new Counter(true);
        System.out.println(checkCounter.toString());
        checkCounter.increase();
        System.out.println("after increase:");
        System.out.println(checkCounter.toString());

        Counter initialCounter = new Counter(10);
        System.out.println(initialCounter.toString());
        initialCounter.increase();
        initialCounter.increase();
        System.out.println("afer double up:");
        System.out.println(initialCounter.toString());

        Counter bothCounter = new Counter(10, true);
        System.out.println(bothCounter.toString());
        bothCounter.decrease();
        bothCounter.decrease();
        System.out.println("after double down");
        System.out.println(bothCounter.toString());



    }
}
