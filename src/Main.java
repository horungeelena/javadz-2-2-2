public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 58.6F;
        float height = 1.65F;
        float bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
