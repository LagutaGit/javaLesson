public class Main {
    public static void main(String[] args) {
        int weatherTemp = 4;
        if (weatherTemp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else if (weatherTemp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("Что-то не так");
        }
    }

}
