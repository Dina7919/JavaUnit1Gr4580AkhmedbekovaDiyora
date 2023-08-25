import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // task1();
        // task2();
        // task3();
        // String[] lines = { "dom", "domovoy", "domashniy" };
        // int prefixLen = findPrefix(lines);
        // System.out.println(prefixLen);
        // task4();
        // task5();
        // task8();
        // int n = 6;
        // homeTask1(n);
        // homeTask2();
        int num1 = 6;
        int num2 = 3;
        String var = "+";
        homeTask3(num1, num2, var);


    }
//Реализовать простой калькулятор
    private static void homeTask3(int num1, int num2, String var) {
        switch(var){
            case("+"):
                summarize(num1, num2);
                break;
            case("-"):
                substraction(num1, num2);
                break;
            case("/"):
                dividision(num1, num2);
                break;
            case("*"):
                multiply(num1, num2); 
                break;     
        }
    }

private static int summarize (int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    private static int multiply (int num1, int num2) {
        int multiply = num1 * num2;
        return multiply;
    }
        private static int dividision (int num1, int num2) {
        int divide = num1 / num2;
        return divide;
    }

    private static int substraction (int num1, int num2) {
        int substraction = num1 - num2;
        return substraction;
    }

// Вывести все простые числа от 1 до 1000
    private static void homeTask2() {
        int odd = 1;
        for (int i = 3; i < 1000; i++){
            System.out.println(odd);
            for (int num = 2; num< i; num++){
                if (i % num == 0){
                    odd = 0;
                    break;
            } else{
                odd = i;
            }
            }
        }
    }

    //Вычислить n-ое треугольного число
    //(сумма чисел от 1 до n), 
    //n! (произведение чисел от 1 до n)
    private static void homeTask1(int n){
        
       
        System.out.println("sum = " + sum(n) + '\n' + "multi = " + multi(n));
    }

    private static int sum (int num) {
        int sum = 0;
        for (int i = 0; i < num; i++){
            sum += i;
        }
        return sum;
    }

    private static int multi (int num) {
         int multi = 1;
        for (int i = 1; i < num; i++){ 
            multi *= i;
        }
        return multi;
    }

        private static int divide (int num) {
         int divide = 1;
        for (int i = 1; i < num; i++){ 
            divide /= i;
        }
        return divide;
    }

    private static void task8() {
        int[] num = { 100, 7, 3, 6, 5, 6 };
        System.out.println(meanIndex(num));
    }

    private static int meanIndex(int[] num) {
        int index = 1;
        while (lowSum(num, index) < higSum(num, index)) {
            index++;
        }
        if (lowSum(num, index) == higSum(num, index)) {
            return index;
        } else {
            return -1;
        }
    }

    private static int higSum(int[] num, int index) {
        int sum = 0;
        for (int i = num.length - 1; i > index; i--) {
            sum += num[i];
        }
        return sum;
    }

    private static int lowSum(int[] num, int index) {

        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += num[i];
        }
        return sum;
    }

    private static void task5() {
        String sourceLn = "Welcome To Java Cource";
        String[] splitLn = sourceLn.split(" ");
        String outLn = "";
        for (int i = splitLn.length - 1; i >= 0; i--) {
            outLn = outLn + splitLn[i] + " ";
        }
        System.out.println(sourceLn);
        System.out.println(outLn);
    }

    private static void task4() {
        // Напишите метод, который находит самую длинную строку общего префикса среди
        // массива строк.
        // Если общего префикса нет, вернуть пустую строку "".
        String[] lines = { "dom", "domovoy", "domashniy" };
        System.out.println(findPfx(lines));
        System.out.println(lines[0].substring(0, findPfx(lines)));

    }

    private static int findPfx(String[] lines) {
        int res = 0;
        boolean pfxExist = true;
        while (pfxExist) {
            res++;
            for (int i = 0; i < (lines.length - 1); i++) {
                if (res <= lines[i].length() && res <= lines[i + 1].length()) {
                    if (lines[i].substring(0, res).compareTo(lines[i + 1].substring(0, res)) != 0) {
                        res--;
                        pfxExist = false;
                        break;
                    }
                } else {
                    res--;
                    pfxExist = false;
                    break;
                }
            }
        }
        return res;
    }

    public static int findPrefix(String[] strs) {
        String[] lStrs = Arrays.stream(strs).map(s -> s.toLowerCase()).toArray(String[]::new);
        String first = lStrs[0];
        boolean found = false;
        int result = 0;
        for (int prefixLength = 1; prefixLength < first.length(); prefixLength++) {
            String prefix = first.substring(0, prefixLength + 1);
            boolean match = true;
            for (int i = 1; i < lStrs.length; i++) {
                String checkingStr = lStrs[i];
                if (!checkingStr.startsWith(prefix)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                result = prefixLength;
            } else
                break;
        }
        return result;
    }

    private static void task3() {
        // Дан массив nums = [3,2,2,3] и число val = 3.
        // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
        // конец массива.
        // Таким образом, первые несколько (или все) элементов массива должны быть
        // отличны от заданного, а остальные - равны ему.

        int[] arr = new int[] { 1, 1, 0, 3, 1, 1, 3, 0, 1 };
        int val = 3;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                for (int j = i; j < arr.length - 1; j++)
                    arr[j] = arr[j + 1];
                arr[arr.length - 1] = val;
            }
        }

        for (int item : arr)
            System.out.printf("%d\t", item);

    }

    private static void task2() {
        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
        // максимальное количество подряд идущих 1.

        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int cnt = 0;
        int max_cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                cnt++;
            else {
                if (cnt > max_cnt)
                    max_cnt = cnt;
                cnt = 0;
            }
        }
        if (cnt > max_cnt)
            max_cnt = cnt;
        System.out.println(cnt);
        System.out.println(max_cnt);
    }

    private static void task1() {

        System.out.println("Hello, World!");

        // Написать программу, которая запросит пользователя ввести <Имя> в консоли.
        // Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Enter your name: ");

        String name = iScanner.nextLine();

        // System.out.printf("Hello, %s!\n", name);
        Depends(name);
        // System.out.println("Hello, " + name);

    }

    public static void Depends(String name) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        if (lt.getHour() >= 18 && lt.getHour() < 23) {
            System.out.printf("Good evening, %s!\n", name);
        } else if (lt.getHour() >= 23 || lt.getHour() < 5) {
            System.out.printf("Good night, %s!\n", name);
        } else if (lt.getHour() >= 5 || lt.getHour() < 12) {
            System.out.printf("Good morning, %s!\n", name);
        } else if (lt.getHour() >= 12 || lt.getHour() < 18) {
            System.out.printf("Good afternoon, %s!\n", name);
        }
    }
}