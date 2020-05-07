public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        // rate - фиксированная % ставка;
        // sumCredit - сумма кредита;
        // term - срок кредита в месяцах;
        int payment = creditPaymentService.calculate(9.99, 1_000_000, 12);
        System.out.println(payment);

        payment = creditPaymentService.calculate(9.99, 1_000_000, 24);
        System.out.println(payment);

        payment = creditPaymentService.calculate(9.99, 1_000_000, 36);
        System.out.println(payment);
    }
}
