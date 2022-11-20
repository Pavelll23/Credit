public class Main {
    public static void main(String[] args) {
        double credit = 1_000_000; // Сумма кредита
        double period = 12; // Срок кредита
        double persent = 9.99; // Процентная ставка
        CreditPaymentService service = new  CreditPaymentService();
        double myCalculate = service.calculate(1_000_000 , 12 , 9.99);
        double myCalculate1 = service.calculate(1_000_000 , 24 , 9.99);
        double myCalculate2 = service.calculate(1_000_000 , 36 , 9.99);
        System.out.println("На 12 месяцев месечный платеж:" + myCalculate);
        System.out.println("На 24 месяца месечный платеж:" + myCalculate1);
        System.out.println("На 36 месяцев месечный платеж:" + myCalculate2);


    }
}
