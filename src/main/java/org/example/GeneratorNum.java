package org.example;

public class GeneratorNum {
    public int numbers(int kolvo)
    {
        int k=1+(int)(Math.random()*9);

        for (int i =0;i<kolvo;i++)
        {
            int gener=1+(int)(Math.random()*9);
            k*=10;
            System.out.print(gener);
        }

        return k;
    }
}
