public class SimpleLinearRegression {
    private DataSet dataset;
    private Model model;

    public SimpleLinearRegression(DataSet dataset) {
        this.dataset = dataset;
        this.model = new Model();
    }

    public void calculateParameters() {
        double xSum = DiscreteMaths.sum(dataset.getX());
        double ySum = DiscreteMaths.sum(dataset.getY());
        double xySum = DiscreteMaths.sumOfProducts(dataset.getX(), dataset.getY());
        double xSquaredSum = DiscreteMaths.sumOfSquares(dataset.getX());
        int n = dataset.getX().size();

        double beta1 = (n * xySum - xSum * ySum) / (n * xSquaredSum - xSum * xSum);

        double beta0 = (ySum - beta1 * xSum) / n;

        model.setBeta_0(beta0);
        model.setBeta_1(beta1);
    }

    public Model getModel() {
        return model;
    }
}

