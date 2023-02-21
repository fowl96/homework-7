public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 29000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            total += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            i++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while ( i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int total = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        for (int i = 1; i <=10; i++) {
            total = total + total*(birthRate-mortality)/1000;
            System.out.println("Год " + i + ", численность населения составляет " + total);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15000;
        int i = 1;
        for (; deposit < 12_000_000; i++) {
            deposit = deposit + deposit*7/100;
            System.out.println("Месяц " + i + " Итого " + deposit);
            }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        int i = 1;
        for (; deposit < 12_000_000; i++) {
            deposit = deposit + deposit*7/100;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + deposit);
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15000;
        float i = 1f;
        for (; i <= 108; i++) {
            deposit = deposit + deposit*7/100;
            if (i % 6 == 0) {
                System.out.println("Год " + i/12 + " Итого " + deposit);
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday = 6;
        for (int i = 1; i <=31; i++) {
            if ( (i - friday) % 7== 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println();
    }
    public static void task8() {
        System.out.println("Задача 8");
        for (int i = 1; i <=2122; i++) {
            if ( i  % 79== 0 && i >=1822) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}