public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
    }

    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {

        int a = 1;
        int b = 2;
        int sum = (a + b);

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 100;

        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }
}
