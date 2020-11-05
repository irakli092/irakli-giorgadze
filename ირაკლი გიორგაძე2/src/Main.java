public class Main {
    public static void main(String[] args) {
        CurrencyService currencyService = new CurrencyServiceImpl();
        currencyService.convert();
        currencyService.setExchangeRate();

    }
}
