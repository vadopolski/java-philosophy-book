package ex2;

public class Galaxy extends SunSystem {
    @Override public void addSun() {
        append("Galaxy.sun");
        super.addSun();
    }

    public void addVenera(){
        append("Venera");
    }

    public static void main(String[] args) {
        Galaxy detergent = new Galaxy();
        detergent.addSun();
        detergent.addMars();
        detergent.addVenera();
        detergent.addMoon();
        System.out.println(detergent);

        SunSystem.main(args);

    }
}
