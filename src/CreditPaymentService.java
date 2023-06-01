public class CreditPaymentService {
    public int paymentcalc(long summ, int countmonth, double rate) {
        rate = rate / 12 / 100;
        return (int) ((summ * rate * Math.pow((1 + rate), countmonth)) / (Math.pow((1 + rate), countmonth) - 1));
    }
}

