public class Model {
    private double beta_0;  
    private double beta_1;      

    public double getBeta_0() {
        return beta_0;
    }

    public void setBeta_0(double beta_0) {
        this.beta_0 = beta_0;
    }

    public double getBeta_1() {
        return beta_1;
    }

    public void setBeta_1(double beta_1) {
        this.beta_1 = beta_1;
    }

    @Override
    public String toString() {
        return "Model { Beta_0 = " + beta_0 + ", Beta_1 = " + beta_1 + " }";
    }
}

