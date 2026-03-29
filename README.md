# 💸 Hostel ExpenseTracker

As part of BYOP, I created a simple **Java-based Monthly Expense Tracker** designed for hostel students(especially mine) to manage their pocket money efficiently whether they are from high schools or colleges.

---

## Features::
*  A Fixed monthly budget (₹5000 As I get)
*  Predefined  general expense  categories i.e : Mayuri Freshica, Bistro Cafe, AB Dakshin, Underbelly, Ocean Stationery, Safal Mart, Laundry, Miscellaneous .  
*  Expenses are tracked as based on predefined categories.
*  The Balance is updated instantly.
*  You can reset your balance every month.
*  You can keep track of your daily transactions.

---

## Problem Statement/Objective::
Students living in hostels,PG, away from home often find it difficult to keep track of their daily spending, which can result in overspending.
Thus,my project helps in following ways:
* Monitoring their spending habits.
* Avoiding overspending 
* To better Understand category-wise expenses .
* Keep track of daily or weekly spending.

---

## Tech Stack Used
* Language: **Java**
* Concepts Used:
  * Object-Oriented Programming using Java
  * ArrayList
  * HashMap
  * Enum
  * Exception Handling

---

## Project Structure

```
ExpenseTracker/
│
├── expense/
│   └── HostelExpenseTracker.java   # Contains all classes: Category (Enum),
│                                   # Transaction, and HostelExpenseTracker
│
└── README.md
```


---

## ⚙️ How to Run

### Prerequisites
Before running this project, make sure you have the following installed on your system:
- **Java Development Kit (JDK)** version 8 or above
- A terminal / command prompt
- *Optional:* An IDE like IntelliJ IDEA, Eclipse, or VS Code with Java extension

You can verify your Java installation by running:
```bash
java -version
```

### Step 1 — Clone the repository
```bash
git clone https://github.com/DivyanshuKumarGupta/ExpenseTracker.git
```

### Step 2 — Navigate into the project directory
```bash
cd ExpenseTracker
```

### Step 3 — Compile the Java file
```bash
javac expense/HostelExpenseTracker.java
```

### Step 4 — Run the application
```bash
java expense.HostelExpenseTracker
```

---

## 🖥️ How to Use

Once the application starts, you will see a menu-driven interface in your terminal. Here's what each option does:

| Option | Action |
|--------|--------|
| `1` | Add a new expense under a predefined category |
| `2` | View current balance and total amount spent |
| `3` | View category-wise expense breakdown |
| `4` | View all transactions |
| `5` | Reset balance (use at the start of every new month) |
| `6` | Exit the application |

### Example Usage

```
===== Hostel Expense Tracker =====
Monthly Budget: Rs 5000
1. Add Expense
2. View Balance
3. Category Report
4. View All Expenses
5. New Month Reset
6. Exit

Enter choice: 1
Enter amount: 120

Select Category:
1. Mayuri Freshica
2. Bistro Cafe
3. AB Dakshin
4. Underbelly
5. Ocean Stationery
6. Safal Mart
7. Laundry
8. Miscellaneous

Enter category number: 2
✅ Expense added. Remaining Balance: Rs 4880
```

## 👨‍💻 Author
**Divyanshu Kumar Gupta**

