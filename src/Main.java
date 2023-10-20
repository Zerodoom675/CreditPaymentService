public class Main {
    public static void main(String[] args) {
        CpsService service = new CpsService();
        int sum = 1_000_000;
        double percent = 0.0999;
        int time = 12;
        int Payment = service.calculate(sum, percent, time);
        System.out.println();
        System.out.println("ежемесячный платеж составит " + Payment);

        time = 24;
        Payment = service.calculate(sum, percent, time);
        System.out.println();
        System.out.println("ежемесячный платеж составит " + Payment);

        time = 36;
        Payment = service.calculate(sum, percent, time);
        System.out.println();
        System.out.println("ежемесячный платеж составит " + Payment);

    }
}