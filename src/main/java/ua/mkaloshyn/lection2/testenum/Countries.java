package ua.mkaloshyn.lection2.testenum;

public enum Countries {

    POLAND("PLN"), CANADA("CAD"), GERMANY("EUR");

    private String currency;

    Countries(String currency) {
        this.currency = currency;
    }
}
