
// 🔹 Defining the interface
interface DigitalPayment {
    void pay(double amount);
}

// 🔹 UPI implementation
class UPI implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("📱 Paid Rs." + amount + " via UPI.");
    }
}

// 🔹 Credit Card implementation
class CreditCard implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("💳 Paid Rs." + amount + " using Credit Card.");
    }
}

// 🔹 Wallet implementation
class Wallet implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("👛 Paid Rs." + amount + " from Wallet balance.");
    }
}

// 🔹 Main class
public class Digital_Payment_System {
    public static void main(String[] args) {
        // Different payment methods
        DigitalPayment upi = new UPI();
        DigitalPayment card = new CreditCard();
        DigitalPayment wallet = new Wallet();

        // Sample transactions
        upi.pay(500.0);
        card.pay(1200.5);
        wallet.pay(300.0);
    }
}
