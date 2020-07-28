import java.util.Random;
import java.util.Scanner;

public class java_HW_4 {

    static final int SIZE = 5;
    public static char[][] gameZona;
    static final int FOR_WIN = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char EMPTY = '.';

    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        gameZonaBuild();

        int a = SIZE * SIZE;
        int b = 1;
        printGameZone();
        System.out.println();
        do {

            playerTurn();
            printGameZone();
            System.out.println();
            int pWin = checkWin(DOT_X);
            if (pWin == 1) {
                System.out.println("Вы выиграли!!!");
                break;
            }
            b++;
            if (b<a) {
                iaTurn();
                printGameZone();
                System.out.println();
                int cWin = checkWin(DOT_O);
                if (cWin == 1) {
                    System.out.println("Компьютер выиграл");
                    break;
            }
            }
            b++;
        } while (b<a);
        if (b >= a) {
            System.out.println("Ничья. ");
        }


    }
                      //    ДАННЫЙ МЕТОД ДЛЯ ПОЛЯ 5 Х 5 !!!!!!!! ЧТОБЫ СЫГРАТЬ НА ПОЛЕ 3 Х 3, ЗАКОМЕНТИРУЙТЕ ДАННЫЙ
                      //    МЕТОД, И ОТКОМЕНТИРУЙТЕ МЕТОД С ТАКИМ ЖЕ НАЗВАНИЕМ ВНИЗУ. А ТАКЖЕ НА 6 СТРОЧКЕ ИЗЕНИТЕ
                      //    ЦИФРУ 5 НА 3.
    public static int checkWin(char symb) {
        int a = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j == 0 || j == 1) {
                    if (gameZona[i][j] == symb && gameZona[i][j + 1] == symb && gameZona[i][j + 2] == symb && gameZona[i][j + 3] == symb) {
                        a = 1;
                        break;
                    }
                }
                if (i == 0 || i == 1) {
                    if (gameZona[i][j] == symb && gameZona[i + 1][j] == symb && gameZona[i + 2][j] == symb && gameZona[i + 3][j] == symb) {
                        a = 1;
                        break;
                    }
                }
                if (i == 0 && j == 0 || i == 1 && j == 1) {
                    if (gameZona[i][j] == symb && gameZona[i + 1][j + 1] == symb && gameZona[i + 2][j + 2] == symb && gameZona[i + 3][j + 3] == symb) {
                        a = 1;
                        break;
                    }
                }
                if (i == 4 && j == 0 || i == 3 && j == 1) {
                    if (gameZona[i][j] == symb && gameZona[i - 1][j + 1] == symb && gameZona[i - 2][j + 2] == symb && gameZona[i - 3][j + 3] == symb) {
                        a = 1;
                        break;
                    }
                }
            }
        }
        return a;
    }
                       // ДАННЫЙ МЕТОД ПРЕДНАЗНАЧЕН ДЛЯ ИГРЫ НА ПОЛЕ 3 Х 3!!!
/*    public static int checkWin(char symb) {
        int a = 0;
        for (int i = 0; i<SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j==0) {
                    if (gameZona[i][j] == symb && gameZona[i][j + 1] == symb && gameZona[i][j + 2] == symb) {
                        a = 1;
                        break;
                    }
                }
                if (i==0) {
                    if (gameZona[i][j] == symb && gameZona[i + 1][j] == symb && gameZona[i + 2][j] == symb) {
                        a = 1;
                        break;
                    }
                }
                if (i == 0 && j == 0) {
                    if (gameZona[i][j] == symb && gameZona[i + 1][j + 1] == symb && gameZona[i + 2][j + 2] == symb) {
                        a = 1;
                        break;
                    }
                }
                if (i==1 && j ==1) {
                    if (gameZona[i][j] == symb && gameZona[i - 1][j + 1] == symb && gameZona[i + 1][j - 1] == symb) {
                        a = 1;
                        break;
                    }
                }
            }
        }
        return a;
    }*/

    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Введите номер строки и столбца. Сначала строка, затем столбец.");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        } while (!isCellValid(y, x));
            gameZona[x][y] = DOT_X;
    }


            // ХОД КОМПЬЮТЕРА БЕЗ ИСКУССТВЕННОГО ИНТЕЛЛЕКТА!!!
/*    public static void iaTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(y, x));
        gameZona[x][y] = DOT_O;
    }*/

            // ХОД КОМПЬЮТЕРА С ИСКУССТВЕННЫМ ИНТЕЛЛЕКТОМ, КОТОРЫЙ ПЫТАЕТСЯ НЕ ПРОИГРАТЬ!!!
/*    public static void iaTurn() {
        int x = 0, y = 0;
        int intellect = 0;
        int aa = SIZE * SIZE;
        int i =0;
            while (intellect != 1 && i < aa ) {
                do {
                    x = rand.nextInt(SIZE);
                    y = rand.nextInt(SIZE);
                } while (!isCellValid(y, x));

                gameZona[x][y] = DOT_X;
                intellect = checkWin(DOT_X);
                gameZona[x][y] = EMPTY;
                if (intellect == 1) {
                    gameZona[x][y] = DOT_O;
                }
                i++;
            }
        gameZona[x][y] = DOT_O;
    }*/

        // ХОД КОМПЬЮТЕРА С ИСКУССТВЕННЫМ ИНТЕЛЛЕКТОМ, КОТОРЫЙ ПЫТАЕТЬСЯ ВЫИГРАТЬ!!!
    public static void iaTurn() {
        int intellectNoLose = 0;
        int intellectForWin = 0;
        for (int i=0; i<SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (gameZona[i][j] == EMPTY) {
                    gameZona[i][j] = DOT_X;
                    intellectNoLose = checkWin(DOT_X);
                    gameZona[i][j] = EMPTY;
                    if (intellectNoLose == 1) {
                        gameZona[i][j] = DOT_O;
                        break;
                    }
                    if (intellectNoLose == 0) {
                        gameZona[i][j] = DOT_O;
                        intellectForWin = checkWin(DOT_O);
                        gameZona[i][j] = EMPTY;
                        if (intellectForWin == 1) {
                            gameZona[i][j] = DOT_O;
                            break;
                        }
                    }
                }
            }
        }
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(y, x));
        gameZona[x][y] = DOT_O;
    }



    public static void gameZonaBuild() {
        gameZona = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                gameZona [i][j] = EMPTY;
            }
        }
    }

    public static void printGameZone(){
        System.out.print("   ");

        for (int i=0; i<SIZE; i++) {
            System.out.print(i + 1 + "  ");
        }
        System.out.println();
        for (int i=0; i<SIZE; i++) {
            System.out.print(i + 1 + "  ");
            for (int j = 0; j<SIZE; j++){
                System.out.print(gameZona [i][j] + "  ");
            }
            System.out.println();
        }
    }



    public static boolean isCellValid(int y, int x){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            System.out.println("Введенные координаты не существуют или заняты!!!");
            return false;
        }
        return gameZona [x][y] == EMPTY;
        }

}

