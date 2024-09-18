import java.util.List;

public class DiscreteMaths {
    public static double sum(List<Double> values) {
        return values.stream().mapToDouble(Double::doubleValue).sum();
    }

    public static double sumOfProducts(List<Double> values1, List<Double> values2) {
        double sum = 0;
        for (int i = 0; i < values1.size(); i++) {
            sum += values1.get(i) * values2.get(i);
        }
        return sum;
    }

    public static double sumOfSquares(List<Double> values) {
        return values.stream().mapToDouble(x -> x * x).sum();
    }
}

