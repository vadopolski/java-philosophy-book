package lab_12_7;

public class Description {
    private String description;

    public Description(String description) {
        System.out.println("Creating description is " + description);
        this.description = description;
    }

    public void dispose() {
        System.out.println("Finished description with " + description);
    }
}
