import java.util.Random;
import java.util.Scanner;

public class LAB3 {
    public static void main(String[] args) {
        nachalo(randomInt());
        System.out.println();
    }

    static int randomInt() {
        Random random = new Random();
        int chislo = random.nextInt(10);
        return chislo;
    }

    static void nachalo(int intFetch) {
        //boolean finish;
        int popitka = 3;
        Scanner nom = new Scanner(System.in);
        for (int i = 0; i < popitka; i++) {

            int proverka=i+1;
            System.out.println("Угадайти загаданную цифру. У Вас " + (popitka-i) + " попытки");
           // System.out.printf("Угадайти загаданную цифру. У Вас " + (popitka-i) + " попытки");
            int a = nom.nextInt();

            if (intFetch > a && i<popitka-1) {
               System.out.println("Загаданное число больше");
            } else if (intFetch < a && i<popitka-1) {
               System.out.println("Загаданное число меньше");
            } else if (i==2 &&intFetch!=a){
                System.out.println("Вы проиграли!!!");break;
            } else  { intFetch = a;
            System.out.println("Вы угадали!");
            break;}
        }
        povtorno();

    }

    static void povtorno() {
           Scanner intName = new Scanner(System.in);
            System.out.println("Хотите еще раз сыграть? 1 - Да, 0 - Нет");
            int N = intName.nextInt();
            switch (N) {
                case 1: nachalo(randomInt());break;
                case 0:
                    System.out.println("Спасибо за игру!");break;
            }
        }

}
