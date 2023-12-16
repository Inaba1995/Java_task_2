import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму на балансе: ");
        int balance = sc.nextInt();

        System.out.print("Введите суму, вносимую на баланс: ");
        int sum = sc.nextInt();

        // минимальная сумма пополнения, более которой начисляются бонусы
        final int minSumBonus = 1000;
        // количество рублей, за которое начисляется 1 бонус
        final int countRubBonus = 100;

        // изначально количество бонусов равно 0
        int bonus = 0;
        // но если сумма пополнения составила более чем 1000 рублей,
        if (sum > minSumBonus)
            // то вычисляем количество бонусов с использованием целочисленного деления
            bonus = sum / countRubBonus;

        // вычисляем итоговый счёт
        int total = balance + sum + bonus;

        // выводим результаты
        System.out.println("Итоговый счет = " + total);
        System.out.println("Количество бонусных рублей: " + bonus);

    }
}