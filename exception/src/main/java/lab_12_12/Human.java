package lab_12_12;

public class Human {
    public static void main(String[] args) {
        // TODO: 03.01.2018 Exersize 30. 
        try {
            throw new Sneeze();
        } catch (Sneeze e) {
            System.out.println("Перехвачен Sneese");
        } catch (Annoyamce e1) {
            System.out.println("Перехвачен Annoyance.");
        }

        try {
            throw new Annoyamce();
        } catch (Annoyamce e){
            System.out.println("Перехвачено Annoyance.");
        }



//        try {
//            throw new Annoyamce();
//        } catch (Annoyamce e){
//            System.out.println("Перехвачено Annoyance.");
//        }
    }
}
