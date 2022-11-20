public class CreditPaymentService {
    public double calculate(double credit, double period, double persent) {
        double interestRate = persent / 12 / 100;
        double result = (credit * interestRate * Math.pow (1 + interestRate , period) / (Math.pow (1 + interestRate , period) - 1));
        return (int) result;


        }
    }
