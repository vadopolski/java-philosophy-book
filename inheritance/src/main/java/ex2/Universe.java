package ex2;

public class Universe extends Galaxy {

    public void addStar(){
        append("UniverseStar");
    }

    @Override public void addSun() {
        append("Universe.Sun");
        super.addSun();
    }

    public static void main(String[] args) {
        Galaxy.main(args);

        Universe universe = new Universe();

        universe.addVenera();
        universe.addMoon();
        universe.addMars();
        universe.addSun();
        universe.addStar();

        System.out.println(universe);
    }
}
