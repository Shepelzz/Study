package lesson12;

public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapitel) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapitel);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if(getCurrency() == Currency.USD)
            return 1000;
        return 1200;
    }

    @Override
    public int getLimitOfFunding() {
        if(getCurrency() == Currency.EUR)
            return 10000;
        return Integer.MAX_VALUE;
    }

    @Override
    public double getMonthlyRate() {
        if(getCurrency() == Currency.EUR)
            return 0.02;
        else
            return 0.01;
    }

    @Override
    public double getCommission(int amount) {
        if(getCurrency() == Currency.USD){
            if(amount <= 1000)
                return 0.05;
            else
                return 0.07;
        }
        else {
            if(amount <= 1000)
                return 0.06;
            else
                return 0.08;
        }
    }
}
