import java.util.Scanner;

public class Зфзф {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Запрос логина
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

// Запрос пароля
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

// Запрос подтверждения пароля
        System.out.print("Подтвердите пароль: ");
        String confirmPassword = scanner.nextLine();

// Проверка длины пароля
        if (password.length() > 20) {
            System.out.println("Ошибка: Пароль должен быть не менее 20 символов в длину.");
            return;
        }

// Проверка символов пароля
        if (!password.matches("[a-zA-Z0-9_]+")) {
            System.out.println("Ошибка: Пароль должен содержать только латинские буквы, цифры и знак подчёркивания.");
            return;
        }

// Проверка соответствия пароля и подтверждения
        if (!password.equals(confirmPassword)) {
            System.out.println("Ошибка: Пароль и подтверждение пароля не совпадают.");
            return;
        }

// Если все проверки пройдены, выводим сообщение об успешной регистрации
        System.out.println("Регистрация прошла успешно!");
    }
}