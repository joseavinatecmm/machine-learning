import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Double> x = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> y = Arrays.asList(3.0, 5.0, 7.0, 9.0, 11.0);

        DataSet dataset = new DataSet(x, y);
        SimpleLinearRegression regression = new SimpleLinearRegression(dataset);
        regression.calculateParameters();

        Model model = regression.getModel();
        System.out.println(model);
    }
}

