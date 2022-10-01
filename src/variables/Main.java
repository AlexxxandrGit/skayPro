package variables;

public class Main {


    public static void main(String[] args) {
        task8();
    }


    public static void task6() {

        System.out.println("Задача 1");
        System.out.println();
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;

        int result = a * (b + (c - d * e));
        System.out.println(result * -1);

    }

    public static void task7() {

        int a = 5;
        int b = 7;
        a = a + b - a;
        b = (b + b + b + b + b) / a;
        System.out.println(a);
        System.out.println(b);

    }

    public static void task8() {
        int a = 125;
        int b = (a % 100) / 10;
        System.out.println(b);

    }


}

