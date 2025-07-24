package JavaCore;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * REGULAER EXPRESSIONS
 * 
 * (abc)            Группируют в один блок.
 * [abc]            Один символ: a, b или c
 * [a-z]            Один символ из диапазона: от a до z
 * a|b              Совпадение с: a или b
 * \\d              Цифра: [0-9]
 * \\w              Символ слова: [a-zA-Z_0-9]
 * \\s              Все виды пробельных символов: ' '\t\n\r\f\u000B
 * \\p{L}           Все буквы
 * \\p{IsCyrillic}  Кириллица
 * \\p{Digit}       Цифры
 * \\p{Punct}       Знаки пунктуации: !?,.:;'"
 * \\p{Space}       Пробельне символы (визуальные)
 * .                Абсолютно любой одиночный символ (кроме \n)
 * a{3}             Ровно 3 символа 'a': aaa
 * a{3,}            3 или более символов 'a'
 * a{2,4}           От 2 до 4 символов 'a': aa, aaa или aaaa
 * ^                Начало строки
 * $                Конец строки
 * *                Совпадает с нулём или более повторений
 * +                Совпадает с одним или более повторений
 * ?                Совпадает с нулём или одним повторением
 */

public class JavaRegularExpressions {
    
    public static void main(String[] args) {

        System.out.println("containsPattern: " + containsPattern("x", "hello"));
        System.out.println("containsPattern (\\d): " + containsPattern("gent \\d{3,4}$", "agent 007"));
        System.out.println("containsPattern (\\w): " + containsPattern("agen\\w 007", "agent 007"));
        System.out.println("containsPattern (\\w \\s \\d): " + containsPattern("^\\w{5}\\p{Space}\\d{3}$", "agent 007"));
        System.out.println("containsPattern (group): " + containsPattern("^\\w{5}\\p{Space}(\\d{3})$", "agent 007"));

        System.out.println("groupPattern: " + groupPattern("^\\w{5}\\ (\\d{3})$", "agent 007"));

    }

    private static boolean containsPattern(String patternS, String matcherS) {
        Pattern pattern = Pattern.compile(patternS);
        Matcher matcher = pattern.matcher(matcherS);
        return matcher.find();
    }

    private static ArrayList<String> groupPattern(String patternS, String matcherS) {
        ArrayList<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(patternS);
        Matcher matcher = pattern.matcher(matcherS);
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }

}
