import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
          Напишите программу, которая:· Запрашивает от пользователя размер массива ,
        · Создает массив с заданным размером,· Заполняет массив случайными числами от 1 до 12
        · Выводит этот массив на консоль двумя способами1.Просто значение внутри массива2.
          К какому месяцу относится данное числоПример:
          •Введите размер массива: 3•Ваш массив =•10 1 2
          •Октябрь Январь Февраль
         */


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива : ");
        int size = scanner.nextInt();
        int array[] = new int[size];


        int count = 0;
        System.out.println("Ваш массив = ");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(12 - 1 + 1) + 1;
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
        for (int i = 0; i < size; i++) {
            switch (array[i]) {
                case 1:
                    System.out.print("January ");
                    break;
                case 2:
                    System.out.print("February ");
                    break;
                case 3:
                    System.out.print("March ");
                    break;
                case 4:
                    System.out.print("April ");
                    break;
                case 5:
                    System.out.print("May ");
                    break;
                case 6:
                    System.out.print("June ");
                    break;
                case 7:
                    System.out.print("July ");
                    break;
                case 8:
                    System.out.print("August ");
                    break;
                case 9:
                    System.out.print("September ");
                    break;
                case 10:
                    System.out.print("October ");
                    break;
                case 11:
                    System.out.print("November ");
                    break;
                case 12:
                    System.out.print("December ");
                    break;
                default:
                    System.out.print("Sorry");
            }
        }
    }
}


