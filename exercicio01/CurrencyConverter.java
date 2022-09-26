package exercicio01;

abstract public class CurrencyConverter {
    static double dollarToReal(double amount, double dollarPrice){
        return dollarPrice * 1.06 * amount;
    }
}
