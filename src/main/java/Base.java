import sweets.Candy;
import sweets.Jellybean;
import sweets.Marmalade;
import sweets.Sweets;

public class Base {
    public static void main(String[] args){
        Sweets candy1 = new Candy("Alenka", 10.0, 100.0,"L","chocolate");
        Sweets candy2 = new Candy("Merci", 20.0, 200.0,"XL","chocolate");
        Sweets jellybean1 = new Jellybean("Orbit",3.0,30.0,"S","red");
        Sweets jellybean2 = new Jellybean("Dirol",5.1,35.5,"S","blue");
        Sweets marmalade1 = new Marmalade("NewYear",25.3,50.4,"M", "circle");
        Sweets marmalade2 = new Marmalade("Christmas",35.8,55.0,"L", "square");

        Present present = new Present(candy1, candy2, jellybean1, jellybean2, marmalade1, marmalade2);

        System.out.println(present);
        System.out.println("Общая стоимость: " + present.getTotalPrice());
        System.out.println("Общий вес: " + present.getTotalWeight());
        }
    }

