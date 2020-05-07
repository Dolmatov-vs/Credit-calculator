public class CreditPaymentService {
    public int calculate(double rate, int sumCredit, int term) {
        double monthlyRate = rate / 12 / 100;  // Ставка по кредиту в месяц
        double coefficient = (monthlyRate * Math.pow((1+monthlyRate), term)) / (Math.pow((1+monthlyRate), term) - 1); // Коэффициент аннуитета
        int payment = (int) (coefficient * sumCredit);  //  Ежемесячный аннуитетный платеж
        return payment;
    }

}
