public class Task2 {

    //Задание №2
    //Напишите метод, который сжимает строку.
    //сжатие с потерями
    //Пример: вход aaaabbbcdd.
    //Выход: abcd
    //вернуть невозиожно
    //Сжатие без потерь
    //Выход: a3c2b2acbab

    public static String compressString(String input) {
        //сжатие без потерь
        StringBuilder sb = new StringBuilder();
        char sbl = input.charAt(0);
        int count = 1;

        //aaaaabbbaaabbbbbbb
        //a5b3b7

        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);

            if (nextChar == sbl) {
                count++;
            } else {
                sb.append(sbl);
                sb.append(count);
                sbl = nextChar;
                count = 1;
            }
        }

        sb.append(sbl);
        sb.append(count);

        return sb.toString();
    }

    public static String compress(String s){
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        sb.append(chars[0]);
        int count = 0;
        char lastAddedChar = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if(lastAddedChar == chars[i]){
                count++;
            }
            else {
                sb.append(count);
                count = 0;
                sb.append(chars[i]);
                lastAddedChar = chars[i];
            }
        }
        return sb.toString();
    }
}