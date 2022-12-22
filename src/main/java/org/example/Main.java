package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double []ser=new double[5];
        for(int i=0;i<5;i++)
        {
            ser[i]=Math.random()*100;
        }
        //int []ser=new int[6];
        int summa=0;
        double max=0;
        double min=ser[0];
        long multi=1;
        for(int i=0;i<ser.length;i++)
        {
            if (max<ser[i])
                max=ser[i];
            if(min>ser[i])
                min=ser[i];
            System.out.println("Переменная номер "+i+" = "+ ser[i]);
            summa+=ser[i];
            multi*=ser[i];
        }
        System.out.println("Сумма ( способ #1) = "+summa);
        System.out.println("Сумма ( способ #2) = "+ Arrays.stream(ser).sum());
        System.out.println("Умножение = "+multi);
        System.out.println("Самое большое число в массиве( способ #1) = "+max);
        System.out.println("Самое большое число в массиве( способ #2) = "+ Arrays.stream(ser).max());
        System.out.println("Самое маленькое число в массиве( способ #1) = "+ Arrays.stream(ser).min());
        System.out.println("Самое маленькое число в массиве( способ #2) = "+min);

    }
}