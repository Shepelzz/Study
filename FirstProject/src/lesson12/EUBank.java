package lesson12;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapitel) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapitel);
    }

    @Override
    public int getLimitOfWithdrawal() {
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        return 0;
    }

    @Override
    public double getMonthlyRate() {
        return 0;
    }

    @Override
    public double getComission(int amount) {
        return 0;
    }
}
