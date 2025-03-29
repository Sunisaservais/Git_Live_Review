package day03_branching_pull_request;

public class Stock {
    String name;
    String company;
    double price;

    public Stock(String name, String company, double price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
