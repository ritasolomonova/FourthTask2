package sweets;

public class Jellybean extends Sweets{
    private String color;

    public Jellybean(String name, Double weight, Double price, String size, String color) {
        super(name, weight, price, size);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Candy = [" + super.toString() + " color = " + color + "]";
    }
}
