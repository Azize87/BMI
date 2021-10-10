public class BmiService {
    public double calculate(int weight, double height) {

        double bMi = weight / (height * height);
        return bMi;
    }

}

