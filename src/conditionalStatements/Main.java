package conditionalStatements;

public class Main {

    public static void main(String[] args) {
        task6();
    }

    public static void task6() {
        int age = 18;
        int salary = 80_000;
        if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы вам выдать кредитную карту с лимитом " + (salary * 3) * 1.2 + " руб.");
        } else if (age >= 23 && salary >= 80_000) {
            System.out.println("Мы готовы вам выдать кредитную карту с лимитом " + (salary * 3) * 1.5 + "руб.");
        } else if (age < 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы вам выдать кредитную карту с лимитом " + (salary * 2) * 1.2 + "руб");
        } else {
            System.out.println("Мы готовы вам выдать кредитную карту с лимитом " + (salary * 2) * 1.5 + "руб.");
        }


    }


}



















