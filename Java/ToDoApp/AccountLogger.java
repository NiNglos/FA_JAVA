public class AccountLogger {
    private AccountMaker accountMaker;

    AccountLogger(AccountMaker accountMaker) {
        this.accountMaker = accountMaker;
    }

    boolean isLoginDataIncorrect(String login, String password) {
        Account account = accountMaker.getLoginDetails().get(login);
// надо протестить
        if (account != null && account.getPassword().equals(password)) {
            System.out.println("logged in.");
            return false;
        } else {
            System.out.println("Bad login or password");
        }

        return true;
    }
}