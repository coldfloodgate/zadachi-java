// Задача 1: Четное или нечетное число
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        // Задача 2
        System.out.println("Введите три целых числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Минимальное число: " + min);

        // Задача 3
        System.out.println("Таблица умножения на 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // Задача 4
        System.out.println("Введите число N:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + ": " + sum);

        // Задача 5
        System.out.println("Введите число N для чисел Фибоначчи:");
        n = scanner.nextInt();
        int fib1 = 0, fib2 = 1;
        System.out.print("Первые " + n + " чисел Фибоначчи: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib1 + " ");
            int next = fib1 + fib2;
            fib1 = fib2;
            fib2 = next;
        }
        System.out.println();

        // Задача 6
        System.out.println("Введите число для проверки простоты:");
        number = scanner.nextInt();
        boolean isPrime = number > 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Число " + number + (isPrime ? " является простым" : " не является простым"));

        // Задача 7
        System.out.println("Введите число N для обратного порядка:");
        n = scanner.nextInt();
        System.out.println("Числа от " + n + " до 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 8
        System.out.println("Введите два числа A и B:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        sum = 0;
        for (int i = Math.min(A, B); i <= Math.max(A, B); i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма четных чисел в диапазоне: " + sum);

        // Задача 9
        System.out.println("Введите строку:");
        scanner.nextLine(); // consume newline
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Строка в обратном порядке: " + reversed);

        // Задача 10
        System.out.println("Введите целое число для подсчета цифр:");
        number = scanner.nextInt();
        int digitCount = String.valueOf(Math.abs(number)).length();
        System.out.println("Количество цифр: " + digitCount);

        // Задача 11
        System.out.println("Введите число N для вычисления факториала:");
        n = scanner.nextInt();
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + n + ": " + factorial);

        // Задача 12
        System.out.println("Введите целое число для суммы цифр:");
        number = scanner.nextInt();
        sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр числа: " + sum);


        // Задача 14
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальное число в массиве: " + max);

        // Задача 15
        sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Сумма всех элементов массива: " + sum);

        // Задача 16
        int positiveCount = 0, negativeCount = 0;
        for (int num : array) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);

        // Задача 17
        System.out.println("Введите два числа A и B для поиска простых чисел:");
        A = scanner.nextInt();
        B = scanner.nextInt();
        System.out.println("Простые числа в диапазоне:");
        for (int i = Math.min(A, B); i <= Math.max(A, B); i++) {
            if (i > 1) {
                boolean prime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();

        // Задача 18
        System.out.println("Введите строку для подсчета гласных и согласных:");
        input = scanner.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for (char ch : input.toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        System.out.println("Гласных: " + vowels);
        System.out.println("Согласных: " + consonants);

        // Задача 19
        System.out.println("Введите строку для обратного порядка слов:");
        input = scanner.nextLine();
        String[] words = input.split(" ");
        System.out.println("Слова в обратном порядке:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();

        // Задача 20
        System.out.println("Введите число для проверки числа Армстронга:");
        number = scanner.nextInt();
        int temp = number, armstrongSum = 0, digits = String.valueOf(number).length();
        while (temp != 0) {
            int digit = temp % 10;
            armstrongSum += Math.pow(digit, digits);
            temp /= 10;
        }
        System.out.println("Число " + number + (armstrongSum == number ? " является числом Армстронга" : " не является числом Армстронга"));
    }
}
