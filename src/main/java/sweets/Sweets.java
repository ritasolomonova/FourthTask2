package sweets;

public abstract class Sweets {
    private String name;
    public Double weight;
    public Double price;
    private String size;

    public Sweets(String name, Double weight, Double price, String size) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "name = " + name + " weight = " + weight + " price = " + price + " size = " + size;
    }
}
