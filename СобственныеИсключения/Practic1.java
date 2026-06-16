class InsufficientFundsException extends Exception {

    private double balance;

    public InsufficientFundsException() {
        super();
    }

    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsufficientFundsException(String message, double balance) {
        super(message);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

void withdraw(double amount) throws InsufficientFundsException {
    double currentBalance = 500;
    if (amount > currentBalance) {
        throw new InsufficientFundsException("Недостаточно средств. Запрошено: " + amount, currentBalance);
    }
}

void main() {
    try {
        withdraw(1000);
    } catch (InsufficientFundsException e) {
        System.out.println("Ошибка: " + e.getMessage());
        System.out.println("Ваш баланс: " + e.getBalance());
    }
}

