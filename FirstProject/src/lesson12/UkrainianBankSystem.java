package lesson12;

public class UkrainianBankSystem implements BankSystem {

    @Override
    public void withdraw(User user, int amount) {
        //проверить можно ли снять - проверить лимит, достаточно ли денег

        if(!checkWithdraw(user, amount))
            return;
        user.setBalance(user.getBalance() - amount - amount * user.getBank().getComission(amount));
    }

    @Override
    public void fund(User user, int amount) {
        //TODO homework
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        //снимаем деньги
        //пополняем с frmoUser - ToUser

        if(!checkWithdraw(fromUser, amount))
            return;
        //TODO checkFundRules

        fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getComission(amount));
        //TODO fund

    }

    @Override
    public void paySalary(User user) {
        //TODO homework
    }

    private void withdrawalErrorMsg(int amount, User user){
        System.err.println("Cant withdraw money "+ amount + " from user" + user.toString());
    }

    private boolean checkWithdraw(User user, int amount){
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal())
                && checkWithdrawLimits(user, amount, user.getBalance());
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit){
        if(amount + user.getBank().getComission(amount) > limit) {
            withdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }
}
