package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        GeneratorWords generatorWords=new GeneratorWords();
        GeneratorNum generatorNum = new GeneratorNum();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Выбор метода : ");
        String s=scanner.nextLine();
        switch(s){
            case("w") :System.out.println( generatorWords.serebrig(5)); break;
            case("n"): System.out.println("\n"+ generatorNum.numbers(5)); break;
        }
    }
}