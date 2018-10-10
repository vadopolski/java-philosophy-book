package my_exception_test;

public class CaughtInnerException {


	public static void caughtException(){
		String errorMesage ="";
			try {
			System.out.println("Outer place in code with possible error.");

			try {

				System.out.println("Place in inner try code with possible error");
				throw new Exception("Inner try exception.");

			} catch (Exception e){
//				errorMesage = e.getMessage();
				System.out.println("Place in inner catch code with possible error");


				int i = (int)(Math.random() * 100);

				if (i%2 == 0) {
					throw new Exception("Inner caught exception.");
				}


				throw e;
			}

		} catch (Exception e){
			if(errorMesage.equals("")){
				System.out.println("!!!!!!!!! Errror message is " + errorMesage);
			} else {
				System.out.println("????????? Error message is " + e.getMessage());

			}
		}


	}

	public static void main(String[] args) throws Exception {
		caughtException();
	}

}
