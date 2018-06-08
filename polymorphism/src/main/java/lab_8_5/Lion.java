package lab_8_5;

public class Lion extends Animal {
    @Override public void eat() {
        System.out.println("Lion eat.");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.hunt();

        Animal animal = new Lion();
        animal.eat();
        animal.hunt();

        Animal animal1 = new Animal();
        animal1 = lion;
        animal1.eat();

    }
}
