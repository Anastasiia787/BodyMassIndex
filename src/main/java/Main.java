public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double BMI = service.calculate(50, 150);
        System.out.printf("%.1f",BMI);
    }
}
