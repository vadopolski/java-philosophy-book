package lab_12_1;

public class NullPointerExceptionRunner2 {
    private static String st = null;

    public static void main(String[] args) {
        try {
            st.length();
        }catch (NullPointerException e){
            System.err.println("Object  is null.");
        }
    }
}
