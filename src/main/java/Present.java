import sweets.Sweets;

public class Present {
    public Sweets[] present;

    public Present(Sweets... present) {
        this.present = present;
    }

    public double getTotalWeight() {
        double sum = 0;
        for (Sweets sweets : present) {
            sum += sweets.weight;
        }
        return sum;
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Sweets sweets : present) {
            sum += sweets.price;
        }
        return sum;
    }
    @Override
    public String toString() {
        String result = "";
        for (Sweets sweets : present) {
            result += "\n"+sweets;
        }
        return result;
    }
}
