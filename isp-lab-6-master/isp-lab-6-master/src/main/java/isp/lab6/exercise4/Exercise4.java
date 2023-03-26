package isp.lab6.exercise4;

import java.util.ArrayList;

//////////////////////////////////////////
abstract class Transaction {

    protected Account account;

    public Transaction(Account account) {
        this.account = account;
    }

    abstract public String execute();
}

//////////////////////////////////////////
class WithdrawMoney extends Transaction {

    private int amount;

    public WithdrawMoney(int amount, Account account) {
        super(account);
        this.amount = amount;

    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String execute() {
        if (account.getBalance() > amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Transaction executed");
        }
        return "EXECUTED!";
    }
}

class CheckMoney extends Transaction {

    public CheckMoney(Account account) {
        super(account);
    }

    @Override
    public String execute() {
            System.out.println("The balance is:"+this.account.getBalance());
        return "EXECUTED!";
    }
}

class ChangePin extends Transaction {

     public String oldPin;
     public String newPin;

    public ChangePin(Account account, String oldPin, String newPin) {
        super(account);
        this.oldPin=oldPin;
        this.newPin=newPin;
    }
        
     @Override
    public String execute() {
        if (account.getCard().getPin().equals(oldPin)) {
            this.account.getCard().setPin(this.newPin);
            System.out.println("The PIN was changed succesfully!");
        }
        return "EXECUTED!";
    }
}
//////////////////////////////////////////

class Card {

    private String cardId;
    private String pin;

    public Card(String cardId, String pin) {
        this.cardId = cardId;
        this.pin = pin;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}

//////////////////////////////////////////
class Account {

    private String owner;
    private int balance;
    private Card card;

    public Account(String owner, int balance, Card card) {
        this.owner = owner;
        this.balance = balance;
        this.card = card;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}

//////////////////////////////////////////
class Bank {

    ArrayList<Account> list = new ArrayList<>();

    public void addAccount(Account a) {
        list.add(a);
    }

    public void executeTransaction(Transaction t) {
        t.execute();
    }

    public Account getAccountByCardId(String id) {
        for(int i=0;i<list.size()-1;i++) {
            if(list.get(i).getCard().getCardId().equals(id))
                return list.get(i);
        }   
        return null;
    }
}

//////////////////////////////////////////
class ATM {

    private Bank bank;
    private Card card;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void insertCard(Card c, String pin) {
        if (card != null) {
            if (c.getCardId().equals(pin)) {
                System.out.println("Card accepted.");
                card = c;
            } else {
                System.out.println("Pin is not valid.");
            }
        } else {
            System.out.println("Card already inserted.");
        }
    }

    public void removeCard() {
        card = null;
    }

    public void withdraw(int amount) {
        if (card != null) {
            Account acc = bank.getAccountByCardId(card.getCardId());
            WithdrawMoney tw = new WithdrawMoney(amount, acc);
            bank.executeTransaction(tw);

        } else {
            System.out.println("No card present.");
        }
    }
    
    public void changePin(String oldPin, String newPin) {
        if (card != null) {
            Account acc = bank.getAccountByCardId(card.getCardId());
            ChangePin tw = new ChangePin(acc, oldPin, newPin);
            bank.executeTransaction(tw);

        } else {
            System.out.println("No card present.");
        }
    }
    
    public void checkMoney() {
        if (card != null) {
            Account acc = bank.getAccountByCardId(card.getCardId());
            CheckMoney tw = new CheckMoney(acc);
            bank.executeTransaction(tw);

        } else {
            System.out.println("No card present.");
        }
    }
}

//////////////////////////////////////////
public class Exercise4 {

    public static void main(String[] args) {
        Card c1 = new Card("12345", "0000");
        Account a1 = new Account("Mihai", 1000, c1);

        Bank bank = new Bank();
        bank.addAccount(a1);

        ATM atm = new ATM(bank);

        atm.insertCard(c1, "0000");

        atm.withdraw(900);

    }
}
