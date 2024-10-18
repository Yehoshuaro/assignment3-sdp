package FifthTask;

public class BankFacade {
    private AccountSystem accountSystem;
    private LoanSystem loanSystem;
    private TransactionSystem transactionSystem;

    public BankFacade(){
        this.accountSystem = new AccountSystem();
        this.loanSystem = new LoanSystem();
        this.transactionSystem = new TransactionSystem();
    }
    public void performBankOpertaions(){
        accountSystem.manageAccount();
        loanSystem.processLoan();
        transactionSystem.makeTransaction();
    }
}
