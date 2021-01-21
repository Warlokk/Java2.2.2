public class BmiService {
    public double calculate(double height, int weight) {
        double bmi = (weight / (height * height / 100 / 100));
        return bmi;
    }
}
