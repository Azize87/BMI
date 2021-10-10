public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bMi = service.calculate(50, 1.69);
        System.out.println("Ваш индекс массы тела " + bMi);
    }

}
