
public class Car {

    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setModel(String model) {
            this.model = model;
    }
    public void setYear(String year) {
        this.year = year;

    }
    public void setPrice(double price) {
        if(price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }else{
        this.price = price;}
    }


    public String getModel() {
        return model;

    }
    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void getDiscount(double percentageDiscount) {
        price -= (percentageDiscount/100) * price;
    }
}
