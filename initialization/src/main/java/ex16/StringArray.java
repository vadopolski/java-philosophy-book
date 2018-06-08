package ex16;

public class StringArray {

    private static String [] strings = new String[5];

    public static void main(String[] args) {
        strings[0] = "First";
        strings[1] = "Second";
        strings[2] = "Third";
        strings[3] = "Fourth";
        strings[4] = "Fifth";

        for (String string: strings)
            System.out.println("Element is " + string);
    }

}
