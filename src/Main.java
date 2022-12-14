public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        int month = 1;
        while (total <= 2_459_000) {
            total = total + deposit;
            System.out.println("Месяц " + month + ", сумма накомплений равна " + total + " рублей");
            month ++;
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 1;
        while (i <=10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i--;
        for (; i >0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthrate = 17;
        int deathRate = 8;
        for (int i = 1; i <= 10; i++) {
            population = population + birthrate * (population / 1000) - deathRate * (population / 1000);
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        float deposit = 15_000;
        float percent = 7 / 100f;
        int month = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit * percent;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        float deposit = 15_000;
        float percent = 7 / 100f;
        int month = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit * percent;
            month++;
            if (month % 6 ==0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
        System.out.println("Через " + month + " месяцев, сумма накоплений равна " + deposit + " рублей. Цель достигнута.");
    }
}