public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        int BMI = service.calculate(50, 150);
        System.out.println(BMI);

    }
}
