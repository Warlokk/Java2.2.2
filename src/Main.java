public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(150, 70);
        String result = String.format("%.2f", bmi);
        System.out.println("Индекс массы тела: " + result);
    }
}
