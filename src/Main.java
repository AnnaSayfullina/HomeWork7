public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}