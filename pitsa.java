import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("возраст: ");
        int age = in.nextInt();
        System.out.print("вес: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.1f \n", name, age, height);
        in.close();
    }
}