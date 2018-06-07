package ex2;

public class SunSystem {
    private String s = "Cleanser";

    public void append(String s){
        this.s +=" " +  s;
    }

    public void addSun(){
        append("Sun");
    }

    public void addMoon(){
        append("Moon");
    }

    public void addMars(){
        append("Mars");
    }

    @Override public String toString() {
        return s;
    }

    public static void main(String[] args) {
        SunSystem cleanser = new SunSystem();
        cleanser.addMars();
        cleanser.addMoon();
        cleanser.addSun();

        System.out.println(cleanser);
    }


}
