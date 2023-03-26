package isp.lab3.exercise5;

public class Exercise5 {
    
    public static void main(String[] args) {
        VendingMachine t;
        t=new VendingMachine();
        t.displayProducts();
        t.displayCredit();
        t.insertCoins(5);
        t.displayCredit();
        t.userMenu();
        
    }
}
