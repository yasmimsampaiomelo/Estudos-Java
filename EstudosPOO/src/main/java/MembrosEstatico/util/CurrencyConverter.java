package MembrosEstatico.util;

public class CurrencyConverter {
    public static double IOF = 0.06;
    public static double calcularConversao(double cotacaoDolar, double dolar){
        return (cotacaoDolar *(1+ IOF) * dolar) ;
    }
}
