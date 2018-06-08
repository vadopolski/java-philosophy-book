package ex21;

import static ex21.Currency.DOLLAR;

public class CurrencyRun {

    public static void descriptCurrency(Currency currency){

        switch (currency){
            case DOLLAR:
                System.out.println("The currency of Japan.");
                break;
            case EURO:
                System.out.println("The currency of Europe.");
                break;
            case RUBLES:
                System.out.println("The currency of Russia.");
                break;
            case YEN:
                System.out.println("The currency of Japan");
                break;
            case POUND:
                System.out.println("The currency of GB");
                break;
            default:
                System.out.println("Other currency.");
        }
    }


    public static void main(String[] args) {
        for (Currency currency: Currency.values()){
            System.out.println(currency.ordinal() +  " " + currency);
        }

        descriptCurrency(Currency.DOLLAR);
        descriptCurrency(Currency.BITCOIN);
        descriptCurrency(Currency.POUND);
        descriptCurrency(Currency.EURO);
        descriptCurrency(Currency.RUBLES);

    }
}
