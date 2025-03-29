package day03_branching_pull_request;

public class MyComputer {
    public String model;
    public double price;

    public MyComputer(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return "MyComputer{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
