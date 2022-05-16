/*ДЗ 11. Палиндром
        Пример строки палиндром - А роза упала на лапу азора
        Читается слева направо так же как и справа налево
        Написать функцию, которая будет определять является ли строка палиндромом
        арозаупаланалапуазора    */

public class Main {


    public static void main(String[] args)  {
        String str = "арозаупаланалапуазора";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("Исходная строка:     " + str);
        System.out.println("Перевёрнутая строка: " + reverse);
        System.out.println(str.equals(reverse));
    }
}

