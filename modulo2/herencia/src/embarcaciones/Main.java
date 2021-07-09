package embarcaciones;

public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("lu", "murga", 123);

        Embarcacion yate1 = new Yate(capitan1, 100, 50, 2020, 20.3, 2);
        Embarcacion yate2 = new Yate(capitan1, 100, 50, 2020, 20.3, 2);

        System.out.println( ((Yate)yate1).compareTo(yate2));
    }
}
