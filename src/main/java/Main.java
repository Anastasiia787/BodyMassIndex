public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double weight = 50;
        double heightSm = 150;
        double bmi = service.calculate(weight, heightSm);
        System.out.printf("%.1f",bmi);
    }
}
