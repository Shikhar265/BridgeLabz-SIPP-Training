// Payment_Gateway.java

// 🔹 Interface with default method
interface PaymentProcessor {
    void pay(double amount);

    // ✅ New method added without breaking old implementations
    default void refund(double amount) {
        System.out.println("Refund of " + amount + " is not supported by this provider.");
    }
}

// 🔹 UPI Provider
class UPIProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }

    // UPI supports refunds → override default
    @Override
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " via UPI.");
    }
}

// 🔹 Credit Card Provider
class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card.");
    }

    // ⚠️ Does not override refund → default method will run
}

// 🔹 Wallet Provider
class WalletProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Wallet.");
    }

    // Wallet supports refunds → override default
    @Override
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " back to Wallet.");
    }
}

public class Payment_Gateway {
    public static void main(String[] args) {
        PaymentProcessor upi = new UPIProcessor();
        PaymentProcessor card = new CreditCardProcessor();
        PaymentProcessor wallet = new WalletProcessor();

        System.out.println("=== Payment Processing ===");
        upi.pay(500);
        card.pay(1200);
        wallet.pay(300);

        System.out.println("\n=== Refund Processing ===");
        upi.refund(200);       // Custom implementation
        card.refund(500);      // Uses default method
        wallet.refund(100);    // Custom implementation
    }
}
