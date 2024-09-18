import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Sample dataset
        List<Double> x = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> y = Arrays.asList(3.0, 5.0, 7.0, 9.0, 11.0);

        // Create the dataset
        DataSet dataset = new DataSet(x, y);

        // Create the regression model
        SimpleLinearRegression regression = new SimpleLinearRegression(dataset);

        // Calculate the slope and intercept
        regression.calculateParameters();

        // Get and display the model
        Model model = regression.getModel();
        System.out.println(model);
    }
}

