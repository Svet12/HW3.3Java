public class CreditPaymentService {

    public int calculate(int loanAmount, int term, float rateA) {

        float rate12 = (rateA / 100) / 12; //месячная процентная ставка
        int monthly = (int) (loanAmount * ((rate12 * (Math.pow(1 + rate12, term))) / (Math.pow(1 + rate12, term) - 1)));
        return monthly;


    }
}
