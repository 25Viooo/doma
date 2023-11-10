import java.util.Scanner;

public class LoginPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
// Запрос логина
            System.out.print("Введите логин: ");
            String login = scanner.nextLine();

// Запрос пароля
            System.out.print("Введите пароль: ");
            String password = scanner.nextLine();

// Запрос подтверждения пароля
            System.out.print("Подтвердите пароль: ");
            String confirmPassword = scanner.nextLine();

            validateLoginAndPassword(login, password, confirmPassword);

            System.out.println("Регистрация прошла успешно!");
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void validateLoginAndPassword(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
// Проверка логина
        if (login.isEmpty()) {
            throw new WrongLoginException("Логин не может быть пустым.");
        }

// Проверка длины пароля
        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль должен быть не менее 20 символов в длину.");
        }

// Проверка символов пароля
        if (!password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчёркивания.");
        }

// Проверка соответствия пароля и подтверждения
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают.");
        }
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}