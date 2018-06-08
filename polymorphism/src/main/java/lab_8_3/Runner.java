package lab_8_3;

public class Runner {

    public static void main(String[] args) {
        Rodent [] rodents = {
            new Hamster(),
            new Mouse(),
            new Hamster(),
            new Mouse(),
            new Hamster()
        };

        rodents[0].drink();
        rodents[1].eat();
        rodents[2].drink();
        rodents[3].eat();
        rodents[3].drink();
        rodents[4].drink();
    }
}
