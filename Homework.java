package Hw2Java;

public class Homework {
    public static void main(String[] args) {
        System.out.println(isPalindrome("a b c_de d,cb :a"));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("abc"));
        System.out.println(isPalindrome("abcd"));
        System.out.println();
        System.out.println(isPalindrome2("as d dsa"));
        System.out.println(isPalindrome2("abc"));
        System.out.println(isPalindrome2("b."));
        System.out.println();
        System.out.println(isPalindrome3("aas_d ?sasA"));
        System.out.println(isPalindrome3("abcDeedC ba."));
        System.out.println(isPalindrome3("qwerty?YTre,wq"));
    }

    /**
     * Проверить, является ли строка палиндромом.
     * Палиндром - это строка, которая читается одинаково слева и справа
     * abcdedcba -> true
     * a -> true
     * abc -> false
     * abcd -> false
     * abba -> true
     */
    static String replaceAllAndToLowerCase(String string) {
        // Убирает все знаки препинания и пробелы
        // и приводит строку к нижнему регистру.
        string = string.replaceAll(
                "[[^\\w][_]]", "").toLowerCase();
        return string;
    }

    static boolean isPalindrome(String source) {
        // Разворачивает строку методом reverse() и проверяет,
        // является ли строка палиндромом.
        source = replaceAllAndToLowerCase(source);
        String string = new StringBuilder(source).reverse().toString();
        if (source.equals(string)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPalindrome2(String source) {
        // Создаем пустой массив символов и записываем в обратном порядке.
        // Проверяет, является ли строка палиндромом.
        source = replaceAllAndToLowerCase(source);
        char[] array = source.toCharArray();
        String res = "";
        for (int i = array.length - 1; i >= 0; i--) {
            res += array[i];
        }
        if (source.equals(res)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPalindrome3(String source) {
        // Разбивает строку на символы и записывает в обратном порядке.
        // Проверяет, является ли строка палиндромом.
        source = replaceAllAndToLowerCase(source);
        String res = "";
        for (int i = 0; i < source.length(); i++) {
            res = source.charAt(i) + res;
        }
        if (source.equals(res)) {
            return true;
        } else {
            return false;
        }
    }
}