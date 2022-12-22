package org.example;

public class Main {
    public static void main(String[] args) {
        String love = "Я люблю програмирование";
        String hello="Привет";
        String name="Юра";
        System.out.println("Изначальные строки :\n\t"+hello+"\n\t"+love+"\n\t"+name);
        if(hello.equals("Пpивет"))
            System.out.println("Неверно!");
        else
            System.out.println("Верно!");
        char k=hello.charAt(3);
        String []loves=love.split(" ");
        for(String loveit:loves)
            System.out.println("Разбиение строки : "+loveit);
        System.out.println("Количество символов : "+hello.length());
        System.out.println("Вывод подстроки : "+love.substring(8));
        System.out.println("Соединение строк : "+hello+", "+name);
        System.out.println("Четвёртый символ в строке : "+k);
        System.out.println("Перевод в нижний регистр : "+hello.toLowerCase());
        System.out.println("Перевод в верхний регистр : "+hello.toUpperCase());
        System.out.println("Замена слова в строке : "+love.replace("люблю","ненавижу"));
        System.out.println(love.startsWith("Я")&love.endsWith("ние"));
    }
}
