// import java.util.ArrayList;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Hyena h1 = new Hyena("Frida ");
        Hyena h2 = new Hyena("Börje ");

        h1.laugh();
        h2.eat("candy ");

        Lion l1 = new Lion("Rune ");
        Lion l2 = new Lion("Tuffis ");

        l1.roar();
        l2.eat("pizzeee ");
/*
        ArrayList<Animal> animals = new ArrayList();

        animals.add(h1);
        animals.add(h2);
        animals.add(l1);
        animals.add(l2);

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
        }

 */
    }
}