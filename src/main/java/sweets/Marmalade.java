package sweets;

public class Marmalade extends Sweets{
    private String shape;

    public Marmalade(String name, Double weight, Double price, String size, String shape) {
        super(name, weight, price, size);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    @Override
    public String toString() {
        return "Candy = [" + super.toString() + " shape = " + shape + "]";
    }
}
