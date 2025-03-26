import java.util.Arrays;

public class Main {

//    -------------- If else --------------

    public static void taskIf1() {
        int age = 18;
        if (age >= 18) {
            System.out.println("Можно");
        } else if (age < 18) {
            System.out.println("Нельзя");
        } else {
            System.out.println("Что-то не так");
        }
    }

    public static void taskIf2() {
        int weatherTemp = 18;
        if (weatherTemp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else if (weatherTemp >= 18) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("Что-то не так");
        }
    }

    public static void taskIf3() {
        int speed = 60;
        if (speed >= 60) {
            System.out.println("Гонщик");
        } else if (speed < 60) {
            System.out.println("Не гонщик");
        } else {
            System.out.println("Что-то не так");
        }
    }

    public static void taskIf4() {
        int age = 19;
        if (age >= 2 && age <= 6) {
            System.out.println("нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("нужно ходить в Универ");
        } else if (age >= 24) {
            System.out.println("ходить на работу");
        } else {
            System.out.println("Неверный возраст");
        }
    }

    public static void taskIf5() {
//        Атакционы
        int age = 14;
        if (age < 5) {
            System.out.println("не может кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("может кататься только в сопровождении взрослого. " +
                    "Если взрослого нет, то кататься нельзя");
        } else if (age >= 14) {
            System.out.println("может кататься без сопровождения взрослого");
        } else {
            System.out.println("Неверный возраст");
        }
    }

    public static void taskIf6() {
        int totalCapacity = 102;  // общая вместимость вагона
        int seatedCapacity = 60;  // количество сидячих мест
        int passengers = 85;      // количество пассажиров

        if (passengers <= seatedCapacity) {
            System.out.println("Есть место в вагоне, свободны сидячие места.");
        } else if (passengers <= totalCapacity) {
            System.out.println("Есть место в вагоне, свободны стоячие места.");
        } else {
            System.out.println("Вагон уже полностью забит.");
        }
    }

    public static void taskIf7() {
        int one = 10;
        int two = 20;
        int three = 15;

        // Проверяем, какое из трех чисел наибольшее
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }

    public static void taskSwitch() {
        int dayOfWeekNumber = 3;
        switch (dayOfWeekNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Что-то не так");
        }
    }

    //    ------------ Циклы ----------------------
    public static void taskCycles1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void taskCycles2() {
//    Високостный
        for (int i = 2020; i < 2077; i = i + 4) {
            System.out.println("Високостный " + i);
        }
    }

    public static void taskCycles3() {
//    Посчитаем зп
        int zp = 58500;
        int total = 0;
        int podrabotka = 20000;
        for (int i = 0; i < 12; i++) {
            total = total + zp;
        }
        for (int i = 0; i < 12; i = i + 3) {
            total = total + podrabotka;
        }
        System.out.println(total);
    }

    public static void taskCycles4() {
//        Все целые числа от 1 до 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void taskCycles5() {
//    от 10 до 1
        for (int i = 10; i > 1; i--) {
            System.out.println(i);
        }
    }

    public static void taskCycles6() {
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void taskCycles7() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void taskCycles8() {
        for (int i = 7; i <= 100; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void taskCycles9() {
        int total = 0;
        int vBanku = 29000;
        for (int i = 1; i <= 12; i++) {
            total = total + vBanku;
        }
        System.out.println(total);
    }

    public static void taskCycles10() {
        float summa = 20000;

        for (int i = 1; i <= 12; i++) {
            summa = summa + (summa * 0.01f);
        }
        System.out.println(summa);
    }

    public static void taskCycles11() {
        int count = 1;
        int count2 = 2;
        int count3 = 3;
        int count4 = 4;
        int count5 = 5;
        int count6 = 6;
        int count7 = 7;
        int count8 = 8;
        int count9 = 9;
        for (int i = 0; i <= 10; i++) {
            System.out.println(count + "*" + i + " = " + count * i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(count2 + "*" + i + " = " + count * i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(count3 + "*" + i + " = " + count * i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(count4 + "*" + i + " = " + count * i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(count5 + "*" + i + " = " + count * i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(count6 + "*" + i + " = " + count * i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(count7 + "*" + i + " = " + count * i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(count8 + "*" + i + " = " + count * i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(count9 + "*" + i + " = " + count * i);
        }
    }

    public static void taskCycles12() {
        for (int number = 1; number <= 10; number++) {
            System.out.println("Таблица умножения для " + number);
            for (int i = 0; i <= 10; i++) {
                System.out.println(number + "*" + i + " = " + (number * i));
            }
        }
    }

//    ----------------- Массивы -----------------------

    public static void taskArrays0() {
        int peremennaya = 25;

        int[] mass = new int[10];
        mass[0] = 5;

        mass[1] = peremennaya;

        int massSize = mass.length;
        System.out.println(massSize);
        char[] chars = new char[15];
        double[] doubleArr = new double[10];
        long[] numbers = new long[82];
        boolean[] bools = new boolean[2];
        int a = chars.length;
        int b = doubleArr.length;
        int c = numbers.length;
        int d = bools.length;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int[] mass2 = new int[10];
        for (int index = 0; index < mass2.length; index++) {
           mass2[index] = index + 1;
        }
        System.out.println(Arrays.toString(mass2));
//        int[] arr = new int[1];
//        arr[1] = 3;
//        System.out.println(Arrays.toString(arr));

    }

    public static void taskArrays1() {
        int[] arrTask1 = new int[3];
        arrTask1[0] = 1;
        arrTask1[1] = 2;
        arrTask1[2] = 3;
        float[] arrTask2 = {1.57f,7.654f,9.986f};
        System.out.println(Arrays.toString(arrTask2));
    }

    public static void taskArrays2() {
        int[] massTask = {12, 32, 45, 78, 98, 45, 66, 5, 4, 8, 9};
        for (int index = 0; index < massTask.length; index++) {
            System.out.println(massTask[index]);
        }
    }

    public static void taskArrays3() {

    }

    public static void taskArrays4() {

    }

    public static void taskArrays5() {

    }

    public static void taskArrays6() {

    }

    public static void taskArrays7() {

    }

    public static void taskArrays8() {

    }

    public static void taskArrays9() {

    }

    public static void main(String[] args) {
//        ------------ Условные операторы-----------
//        taskIf1();
//        taskIf2();
//        taskIf3();
//        taskIf4();
//        taskIf5();
//        taskIf6();
//        taskIf7();

//        ----------------Тема Switch----------
//        taskSwitch();

//        ---------------Тема циклы--------------
//    taskCycles1();
//    taskCycles2();
//        taskCycles3();
//        taskCycles4();
//        taskCycles5();
//        taskCycles6();
//        taskCycles7();
//        taskCycles8();
//        taskCycles9();
//        taskCycles10();
//        taskCycles11();
//        taskCycles12();
//        taskArrays0();
//        taskArrays1();
        taskArrays2();
//        taskArrays3();
//        taskArrays4();
//        taskArrays5();
//        taskArrays6();
//        taskArrays7();
//        taskArrays8();
//        taskArrays9();

    }

}
