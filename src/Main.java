public class Main {
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

    public static void taskSwitch(){
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

    public static void main(String[] args) {
//        Условные операторы
//        taskIf1();
//        taskIf2();
//        taskIf3();
//        taskIf4();
//        taskIf5();
//        taskIf6();
//        taskIf7();

//        Тема Switch
//        taskSwitch();

//        Тема циклы

    }

}
