package lesson3;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scan_choose = new Scanner (System.in);

    public static void main(String[] args) {
        int choose_input;
        do {
            System.out.println("Ваша задача угадать число от 0 до 9");
            if (playLevel()==1) {
        System.out.println("Игра окончена. Играть еще раз?  1 – да / 0 – нет");
            }; choose_input = scan_choose.nextInt();
        } while (choose_input == 1);
        scanner.close();
        scan_choose.close();
    }
    private static int playLevel() {
        int number = (int) (Math.random() * 9);
        int i = 3;
        while (true) {
            System.out.println("Введите число от 0 до 9");
            int input_number = scanner.nextInt();
            if (input_number == number&& i >1) {
                System.out.println("Вы угадали загаданное число!");
                i=1;
                return i;
            } else if (input_number > number&& i >1) {
                System.out.println("Загаданное число меньше. Вы не угадали. У вас попыток: "+ --i);
            } else if (input_number < number&& i >1) {
                System.out.println("Загаданное число больше. Вы не угадали. У вас попыток: " + --i);
            } else if (i==1) {
                System.out.println("Вы не угадали.");
                return i;
            }
            }
        }
    }
