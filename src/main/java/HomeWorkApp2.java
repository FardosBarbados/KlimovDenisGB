public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(numbers10to20(11, 2));
        positivOrNigative(-1);
        System.out.println(positivOrNigativenumbers(-2));
        sayHelloXtimes(6);
    }

    public static boolean numbers10to20(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }

    public static void positivOrNigative(int a) {
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }
    public static boolean positivOrNigativenumbers (int a) {
        return (a < 0);
    }
    public static void sayHelloXtimes (int i) {
        for (i = 1; i <= 5; i++) {
            System.out.println("Привет");
        }
    }
}
