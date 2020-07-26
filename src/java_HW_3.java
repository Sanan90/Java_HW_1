import java.util.Random;
import java.util.Scanner;

public class java_HW_3 {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Предлагаю вам сыграть в одну, из двух игр. Первая игра, это 'Угадай число'. Вторая игра, 'Угадай слово'     1-У-Ч   2-У-С");
        int playOrNot = scan.nextInt();
        if(playOrNot == 1) {
            firstGameStart();
        } else if (playOrNot == 2){
            secondGameStart();
        }


    }

    private static void firstGameStart() {
        int replay = 1;
        while (replay == 1) {
            int randomNum = rand.nextInt(10);
            System.out.println("Компьютер загадал число от 0 до 9. У вас есть три попытки чтобы угадать ее!");

            for (int i = 0; i < 3; i++) {
                int playerAnswer = scan.nextInt();
                if (playerAnswer == randomNum) {
                    System.out.println("Ух ты, все верно!!! Компьютер действительно загадал число " + randomNum + " " + "Вы выиграли.");
                    i = 5;
                } else if (randomNum < playerAnswer) {
                    System.out.println("Увы но нет, число загаданное компьютером меньше чем число " + playerAnswer + ". " + "Попробуйте еще раз");
                } else if (randomNum > playerAnswer) {
                    System.out.println("Увы но нет, число загаданное компьютером больше чем число " + playerAnswer + ". " + "Попробуйте еще раз");
                }
                if (i == 5) {
                    System.out.println("Хотите сыграть еще раз, и дать компьютеру шанс отыграться?    1-Да   0-нет");
                     replay = scan.nextInt();
                } else if (i==2) {
                    System.out.println("А попыток то больше не осталось :( Хотите сыграть еще раз, и попробовать все" +
                            " таки выиграть у компьютера?     1-Да   0-нет");
                    replay = scan.nextInt();
                    }
                    if (replay == 0) {
                        System.out.println("Как скажете. Было приятно с вами сыграть. До следуюущего раза!!!");

                }
            }
        }

    }

    private static void secondGameStart() {
        System.out.println("Компьютер загадает слово, а вы должны попробовать его отгадать. ");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int wordNumber = rand.nextInt(words.length);
        String randomWord = words[wordNumber];
        char[] temporaryValue = new char[]{'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'};
        String userWord = "";
        int wordLength;
        do {
            System.out.println("Попробуйте отгадать слово! ");
            userWord = scan.next();
            if (!randomWord.equals(userWord)) {
                System.out.println("Неа, не угадали!");
                if (userWord.length()<randomWord.length()) {
                    wordLength = userWord.length();
                } else {
                    wordLength = randomWord.length();
                }


                for (int i=0; i<wordLength; i++){
                    if (userWord.charAt(i)==randomWord.charAt(i)) {
                        char a = userWord.charAt(i);
                        temporaryValue[i] = a;
                        System.out.println(temporaryValue);
                    }
                }


            } else if (randomWord.equals(userWord)) {
                System.out.println("Совершенно верно, вы угадали!");
            }
        }while(!randomWord.equals(userWord));

    }

}