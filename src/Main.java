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
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Интерация цикла " + i);
        }
    }
    public static void task2(){
        System.out.println("Задача2");
        for ( int i = 10; i >= 1; i = i - 1) {
            System.out.println("Интерация цикла " + i);
        }
    }
    public static void task3(){
        System.out.println("Задача3");
        for ( int i = 0; i < 17; i = i + 2){
            System.out.println("Интерация цикла " + i);
        }
    }
    public static void task4(){
        System.out.println("Задача4");
        for ( int i = 10; i >= -10; i = i - 1){
            System.out.println("Интерация цикла " + i);
        }
    }
    public static void task5(){
        System.out.println("Задача5");
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }
    }
    public static void task6(){
        System.out.println("Задача6");
        for(int i = 7; i <= 98; i = i + 7){
            System.out.println("Последовательность чисел: " + i);
        }
    }
    public static void task7(){
        System.out.println("Задача7");
        for(int i = 1; i <= 512; i = i * 2){
            System.out.println("Последовательность чисел: " + i);
        }
    }
    public static void task8(){
        System.out.println("Задача8");
        int savings = 29000;
        int total = 0;

        for(int i = 1; i <= 12; i++){
            total = total + savings;
            System.out.println("Месяц " + i + ". Сумма накоплений равна " + total);
        }
        System.out.println(total);
    }
    public static void task9(){
        System.out.println("Задача9");
        int contrinution = 29000;
        int savings = 0;

        for(int i = 1; i <= 12; i++){
            savings = savings + savings/100;
            savings = savings + contrinution;
            System.out.println("Месяц " + i + ". Сумма накоплений равна " + savings);
        }
        System.out.println(savings);
    }
    public static void task10(){
        System.out.println("Задача10");
        int n = 2;
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}