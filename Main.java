import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Д/з: Необходимо написать простой консольный калькулятор на Java.
        // Для считывания ввода нужно использовать класс Scanner. В конце напечатать результат.
        // Используйте форматированный вывод. Пока пусть работает так, пользователь вводит целые числа,
        // а на вывод передается результат 4-х операций(+, -, *, /) без выбора операции.
        // В дальнейшем будете дорабатывать приложение.
        Scanner scanner =new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a=scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b=scanner.nextInt();

        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        System.out.printf("%d \n",c);
        System.out.printf("%d \n",d);
        System.out.printf("%d \n",e);
        System.out.printf("%d",f);

        scanner.close();
    }
}