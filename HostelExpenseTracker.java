package Expense;
import java.util.*;

// Enum for fixed categories (cleaner than strings)
enum Category {
    MAYURI,
    BISTRO,
    AB_DAKSHIN,
    UNDERBELLY,
    OCEAN_STATIONERY,
    SAFAL_MART,
    MISC
}

// Transaction class
class Transaction {
    double amount;
    Category category;

    public Transaction(double amount, Category category) {
        this.amount = amount;
        this.category = category;
    }
}

// Main tracker class
public class HostelExpenseTracker {

    private final double MONTHLY_BUDGET = 5000;
    private double balance;
    private ArrayList<Transaction> transactions;
    private HashMap<Category, Double> categoryTotals;

    public HostelExpenseTracker() {
        balance = MONTHLY_BUDGET;
        transactions = new ArrayList<>();
        categoryTotals = new HashMap<>();

        // initialize all categories to 0
        for (Category c : Category.values()) {
            categoryTotals.put(c, 0.0);
        }
    }

    // Add expense
    public void addExpense(double amount, Category category) {
        if (amount > balance) {
            System.out.println("⚠ Not enough balance!");
            return;
        }

        balance -= amount;
        transactions.add(new Transaction(amount, category));

        // update category total
        categoryTotals.put(category, categoryTotals.get(category) + amount);

        System.out.println("Expense added.");
    }

    // Show balance
    public void showBalance() {
        System.out.println("Remaining Balance: Rs " + balance);
    }

    // Show category-wise spending
    public void showCategoryReport() {
        System.out.println("\n--- Category-wise Spending ---");
        for (Category c : Category.values()) {
            System.out.println(c + " : Rs " + categoryTotals.get(c));
        }
    }

    // Show all transactions
    public void showTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No expenses yet.");
            return;
        }

        System.out.println("\n--- All Expenses ---");
        for (Transaction t : transactions) {
            System.out.println("Rs " + t.amount + " -> " + t.category);
        }
    }

    // Reset for new month
    public void resetMonth() {
        balance = MONTHLY_BUDGET;
        transactions.clear();

        for (Category c : Category.values()) {
            categoryTotals.put(c, 0.0);
        }

        System.out.println("New month started. Budget reset to Rs 5000.");
    }

    // Convert user input to category
    public static Category getCategoryFromChoice(int choice) {
        switch (choice) {
            case 1: return Category.MAYURI;
            case 2: return Category.BISTRO;
            case 3: return Category.AB_DAKSHIN;
            case 4: return Category.UNDERBELLY;
            case 5: return Category.OCEAN_STATIONERY;
            case 6: return Category.SAFAL_MART;
            case 7: return Category.MISC;
            default: return null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HostelExpenseTracker tracker = new HostelExpenseTracker();

        while (true) {
            try {
                System.out.println("\n===== Hostel Expense Tracker =====");
                System.out.println("1. Add Expense");
                System.out.println("2. View Balance");
                System.out.println("3. Category Report");
                System.out.println("4. View All Expenses");
                System.out.println("5. New Month Reset");
                System.out.println("6. Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();

                        if (amt <= 0) {
                            System.out.println("Invalid amount!");
                            break;
                        }

                        System.out.println("\nSelect Category:");
                        System.out.println("1. Mayuri");
                        System.out.println("2. Bistro");
                        System.out.println("3. AB Dakshin");
                        System.out.println("4. Underbelly");
                        System.out.println("5. Ocean Stationery");
                        System.out.println("6. Safal Mart");
                        System.out.println("7. Misc");

                        int catChoice = sc.nextInt();
                        Category cat = getCategoryFromChoice(catChoice);

                        if (cat == null) {
                            System.out.println("Invalid category!");
                            break;
                        }

                        tracker.addExpense(amt, cat);
                        break;

                    case 2:
                        tracker.showBalance();
                        break;

                    case 3:
                        tracker.showCategoryReport();
                        break;

                    case 4:
                        tracker.showTransactions();
                        break;

                    case 5:
                        tracker.resetMonth();
                        break;

                    case 6:
                        System.out.println("Goodbye!");
                        return;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Enter valid numbers!");
                sc.nextLine();
            }
        }
    }
}