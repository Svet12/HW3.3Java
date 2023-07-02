// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String args[]){
//        float rateA = 9.9f ;
//        int term = 24 ;
//        int loanAmount = 1000_000 ;
//        double rate12 = (rateA / 100) / term;
//        int monthly = (int) ((rate12 * loanAmount) / (1 - Math.pow(1 + rate12, -term)));
//
//        System.out.println(monthly);
//    }
//}

public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        float rateA = 9.99f; // годова процентная ставка
        int term = 36; //количество платежей/срок кредитования
        int loanAmount = 1_000_000; //сумма кредита
        int monthly = service.calculate(loanAmount, term, rateA);


        System.out.println(monthly);


    }
}