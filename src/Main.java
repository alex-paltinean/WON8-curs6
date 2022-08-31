public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        System.out.println(clock.getTime());

        Clock clock2 = new Clock();
        System.out.println(clock2.getTime());

        long minute = 46;
        Clock clock3 = new Clock(22, (int) minute);
        System.out.println(clock3.getTime());

    }
}
