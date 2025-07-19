import java.util.ArrayList;
import java.util.Scanner;

class Function {
    private ArrayList<User> users = new ArrayList<>();
    private Scanner scanner;

    public Function(Scanner scanner) {
        this.scanner = scanner;
    }

    public void createaccount() {
        System.out.print("Create Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Full address: ");
        String address = scanner.nextLine();
        System.out.print("Create Atm no# (6 Digit Only): ");
        int atmno = scanner.nextInt();
        System.out.print("Create Pin no# (4 Digit Only): ");
        int pinno = scanner.nextInt();

        if (String.valueOf(atmno).length() != 6) {
            System.out.println("Please create Atm # 6 Digit only!");
        } else if (String.valueOf(pinno).length() != 4) {
            System.out.println("Please create Pin 4 Digit only!");
        } else {
            users.add(new User(name, address, atmno, pinno, age));
            System.out.println("Account created successfully!");
        }
    }

    public void login() throws InterruptedException {
        System.out.print("Enter Your Atm no# (6 Digit Only): ");
        int atmno = scanner.nextInt();
        System.out.print("Enter Your Pin no# (4 Digit Only): ");
        int pinno = scanner.nextInt();

        User loggedInUser = null;
        for (User user : users) {
            if (user.getAtmnumber() == atmno && user.getPin() == pinno) {
                loggedInUser = user;
                break;
            }
        }

        if (loggedInUser != null) {
            System.out.println("Login successful!");
            account(loggedInUser);
        } else {
            System.out.println("Invalid Atm no# or Pin!");
        }
    }

    public void account(User user) throws InterruptedException {
        boolean st = true;
        while (st) {
            System.out.println("\n1. Balance Inquiry \n2. Withdraw \n3. Deposit \n4. Log out");
            System.out.print("Enter choice (1-4 only!): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> user.balanceinquir();
                case 2 -> {
                    System.out.print("Enter Amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    user.withdraw(amount);
                }
                case 3 -> {
                    System.out.print("Enter Amount to deposit: ");
                    double amount = scanner.nextDouble();
                    user.deposit(amount);
                }
                case 4 -> {
                    System.out.print("Log Out");
                    for (int i = 0; i < 5; i++) {
                        System.out.print(".");
                        Thread.sleep(700);
                    }
                    st = false;
                }
                default -> System.out.println("Please choose 1-4 only!");
            }
        }
    }
}


class User {
    private String name, address;
    private int atmnumber, pin, age;
    private double balance;

    public User(String name, String address, int atmnumber, int pin, int age) {
        this.name = name;
        this.address = address;
        this.atmnumber = atmnumber;
        this.pin = pin;
        this.age = age;
        this.balance = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAtmnumber() {
        return atmnumber;
    }

    public void setAtmnumber(int atmnumber) {
        this.atmnumber = atmnumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void balanceinquir() {
        System.out.printf("Balance: %,.2f%n", balance);
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Amount must be positive");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.printf("Successfully Withdrawn %,.2f%n", amount);
        }
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Amount must be positive");
        } else {
            balance += amount;
            System.out.printf("Successfully Deposited %,.2f%n", amount);
        }
    }
}