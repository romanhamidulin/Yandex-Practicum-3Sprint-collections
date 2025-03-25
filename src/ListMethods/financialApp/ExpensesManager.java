package ListMethods.financialApp;

import java.util.ArrayList;

public class ExpensesManager {
    ArrayList<Expense> expenses;

    ExpensesManager() {
        expenses = new ArrayList<>();
    }

    double saveExpense(double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses.add(new Expense(expense));
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            Expense exp = expenses.get(i);
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + exp.getValue() + " рублей, код транзакции: "+exp.getTransaction());
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (Expense exp : expenses) {
            if (exp.getValue() > maxExpense) {
                maxExpense = exp.getValue();
            }
        }
        return maxExpense;
    }

    // добавьте метод removeAllExpenses()
    void removeAllExpenses() {
        if (expenses.size()!=0){
            expenses.clear();
            System.out.println("Список трат пуст");
        }
    }
    // текст для печати: "Список трат пуст."

    // добавьте метод removeExpense(int transaction)
    void removeExpense(int transaction) {
        if (expenses.isEmpty()){
            System.out.println("Список трат пуст");
        } else {
            int index=-1;
            for (int i = 0; i < expenses.size(); i++){
                if (expenses.get(i).getTransaction() == transaction) {
                    index = i;
                    break;
                }
            }
            if (index>0) {
                expenses.remove(index);
                System.out.println("Трата удалена!");
            } else {
                System.out.println("Такой траты нет.");
            }
        }
    }
    /* Текст для печати: "Список трат пуст."
        "Трата удалена!"
        "Такой траты нет." */

}
