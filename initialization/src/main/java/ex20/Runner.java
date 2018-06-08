package ex20;


public class Runner {
    public static void main(String[] args) {
        String[] strings = {"Three", "Two", "One"};

        DynamicMainExperiment.main("One", "Two", "Three");
        DynamicMainExperiment.main();
        DynamicMainExperiment.main(strings);

        MainExperiment.main(strings);
    }
}
