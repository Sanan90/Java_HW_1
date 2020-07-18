public class MainHW {
    public static void main(String[] args) {

//        byte a = 100;
//        a++;
//        System.out.println(a);


//        short a = 30 * 10;
//        int b = 1700;
//        b = a + b;
//        long c = b*b;
//        float d = c/3;
//        double f = d *= 22;
//        System.out.println(f);


//        char a = 'T';
//        System.out.println(a+a+a+a+a+a);


//        boolean b = true;


        float task3print = task3(1.1253f, 1.55555f, 3.144f, 1.11f);
        System.out.println(task3print);

        boolean task2print = task4(6, 4 );
        System.out.println(task2print);

        task5 (-33);

        System.out.println(task6(-46));

        task7("Санан");

        task8 (1900);
    }



        public static float task3(float a , float b, float c, float d) {
             return a * (b + (c / d));
        }


        public static boolean task4 (int a, int b) {
            if (a + b >= 10 && a + b <= 20) {
                return true;
        }   else {
                return false;
        }
        }

        public static void task5 (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        }


    public static boolean task6 (int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void task7 (String name) {
    System.out.println ("Привет " + name + "!");
    }


    public static void task8 (int year ) {
        int a = year%4;
        int b = year%100;
        int c = year%400;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if (a == 0 && b != 0 || a == 0 && c == 0) {
            System.out.println("Введенный год является високосным");
        } else {
            System.out.println("Введенный год не является високосным");
        }
    }
    }

