// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long sum = 1000000;
        int period = 12;
        double percent = 9.99;
        System.out.println(service.paymentcalc(sum, period, percent));
    }
}
