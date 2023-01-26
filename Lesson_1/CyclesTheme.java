public class CyclesTheme {
    public static void main(String[] args) {
        //Задача_1: Подсчет суммы четных и нечетных чисел
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел\n");

        int num = 1;
        int sumEven = 0;
        int sumOdd = 0;
        int resultTask1 = -11;

        do {
            resultTask1 += num;
            if (resultTask1 % 2 == 0) {
                sumEven += resultTask1;
            } else {
                sumOdd += resultTask1;
            }
        } while (resultTask1 <= 20);

        System.out.println("Сумма четных и нечетных чисел в отрезке от: -10 до 21");
        System.out.println("Четных = " + sumEven);
        System.out.println("Нечетных = " + sumOdd);

        //Задача_2: Вывод чисел в интервале (min и max) в порядке убывания
        System.out.println("\n\n2.Вывод чисел в интервале (min и max) в порядке убывания\n");

        int num1Task2 = 10;
        int num2Task2 = 5;
        int num3Task2 = -1;
        int maxNumTask2;
        int minNumTask2;

        if(num1Task2 > num2Task2 && num1Task2 > num3Task2) {
            maxNumTask2 = num1Task2;
        } else if(num2Task2 > num1Task2 && num2Task2 > num3Task2) {
            maxNumTask2 = num2Task2;
        } else {
            maxNumTask2 = num3Task2;
        }

        if(num1Task2 < num2Task2 && num1Task2 < num3Task2) {
            minNumTask2 = num1Task2;
        } else if(num2Task2 < num1Task2 && num2Task2 < num3Task2) {
            minNumTask2 = num2Task2;
        } else {
            minNumTask2 = num3Task2;
        }

        for(int i = maxNumTask2 - 1; i > minNumTask2; i--) {
            System.out.print(i + ", ");
        }

        //Задача_3: Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр\n");

        int num1Task3 = 1_234;
        int onesNum1Task3;
        int sumOnesNum1Task3 = 0;

        while(num1Task3 > 0) {
            onesNum1Task3 = num1Task3 % 10;
            sumOnesNum1Task3 += onesNum1Task3;
            num1Task3 = (num1Task3 - onesNum1Task3) / 10;
            System.out.print(onesNum1Task3 + ", ");
        }

        System.out.println("\nСумма чисел равна: " + sumOnesNum1Task3);

        //Задача_4: Вывод чисел на консоль в несколько строк
        System.out.println("\n\n4.Вывод чисел на консоль в несколько строк\n");

        int num1Task4 = 1;
        int num2Task4 = 24;

        for(int i = num1Task4; i < num2Task4;) {
            for(int y = 0; y < 5; y++) {
                if(i < num2Task4) {
                    System.out.printf("% 3d", i);
                    i = i+2;
                    if(y == 4) {
                        System.out.print("\n");
                    }
                } else {
                    System.out.printf("% 3d", 0);
                }
            }
        }

        //Задача_5: Проверка количества двоек на четность/нечетность
        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность\n");

        int num1Task5 = 3_242_592;
        int numTwosInNum1Task5 = 0;
        int sumTwosInNum1Task5 = 0;

        System.out.print("Число: " + num1Task5 + " содержит ");

        while(num1Task5 > 0) {
            numTwosInNum1Task5 = num1Task5 % 10;
            if(numTwosInNum1Task5 == 2) {
                sumTwosInNum1Task5++;
            }
            num1Task5 = (num1Task5 - numTwosInNum1Task5) / 10;
        }

        System.out.print("Двоек: " + sumTwosInNum1Task5);

        if(sumTwosInNum1Task5 % 2 == 0) {
            System.out.print(" - четное количество");
        } else {
            System.out.print(" - нечетное количество");
        }

        //Задача_6: Отображение фигур в консоли
        System.out.println("\n\n6.Отображение фигур в консоли\n");

        for(int i = 0; i < 5; i++) {
            for(int y = 0; y < 10; y++) {
                if(i < 5) {
                    System.out.print("*");
                    if(y == 9) {
                        System.out.print("\n");
                    }
                }
            }
        }

        System.out.print("\n");

        int sumHash = 15;

        while (sumHash > 0) {
            System.out.print("#");
            sumHash--;
            if(sumHash == 10) {
                System.out.print("\n");
            } else if(sumHash == 6) {
                System.out.print("\n");
            } else if(sumHash == 3) {
                System.out.print("\n");
            } else if(sumHash == 1) {
                System.out.print("\n");
            }
        }

        System.out.println("\n");

        int numDollarSign = 0;

        do {
            System.out.println("$");
            numDollarSign++;
            if(numDollarSign == 1 || numDollarSign == 3) {
                System.out.print("$");
            } else if(numDollarSign == 2) {
                System.out.print("$$");
            }
        } while(numDollarSign < 5);

        //Задача_7: Отображение ASCII-символов
        System.out.println("\n\n7.Отображение ASCII-символов\n");

        System.out.println("Dec Char");

        for(int i = 33; i < 48; i++) {
            if(i % 2 != 0) {
                System.out.printf("%1$3d%2$3s\n", i, (char)i);
            }
        }

        System.out.println("\nDec Char");

        for(int i = 97; i < 123; i++) {
            if(i % 2 == 0) {
                System.out.printf("%1$3d%2$3s\n", i, (char)i);
            }
        }

        //Задача_8: Проверка, является ли число палиндромом
        System.out.println("\n\n8.Проверка, является ли число палиндромом\n");

        int num1Task8 = 1_234_321;
        int num2Task8 = num1Task8;
        int reverseNum1Task8 = 0;

        System.out.print("Число: " + num1Task8 + " является ");

        while(num2Task8 != 0) {
            reverseNum1Task8 = reverseNum1Task8 * 10 + num2Task8 % 10;
            num2Task8 /= 10;
        }
        if(reverseNum1Task8 == num1Task8) {
            System.out.print("палиндромом");
        } else {
            System.out.print("не палиндромом");
        }

        //Задача_9: Определение, является ли число счастливым
        System.out.println("\n\n9.Определение, является ли число счастливым\n");

        int num1Task9 = 467_359;
        int sumFirstHalsNum1Task9 = 0;
        int sumSecondHalsNum1Task9 = 0;

        System.out.print("Число: " + num1Task9);
        for(int i = 0; i < 3; i++) {
            sumFirstHalsNum1Task9 = sumFirstHalsNum1Task9 + num1Task9 % 10;
            num1Task9 /= 10;
        }
        for(int i = 0; i < 3; i++) {
            sumSecondHalsNum1Task9 = sumSecondHalsNum1Task9 + num1Task9 % 10;
            num1Task9 /= 10;
        }
        if(sumFirstHalsNum1Task9 == sumSecondHalsNum1Task9) {
            System.out.print(" является счастливым");
        } else {
            System.out.print(" является не счастливым");
        }

        //Задача_10: Вывод таблицы умножения Пифагора
        System.out.println("\n\n10.Вывод таблицы умножения Пифагора\n");

        int sum1Task10 = 0;

        System.out.printf("%25s%n", "ТАБЛИЦА ПИФАГОРА\n");

        for(int g = 1; g < 10; g++) {
            if(g == 1) {
                System.out.printf("%2$3s%1$s", "|", "_");
            } else {
                System.out.printf("%1$3d%2$s", g, "|");
            }
            for(int y = 2; y < 10; y++) {
                sum1Task10 = y * g;
                if(g == 1) {
                    System.out.printf("%s", "__");
                    System.out.printf("%d", y);
                } else if( g > 1) {
                    System.out.printf("% 3d", sum1Task10);
                }
                if(y == 9) {
                    System.out.print("\n");
                }
            }
        }
    }
}