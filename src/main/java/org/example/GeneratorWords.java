package org.example;

public class GeneratorWords {
    public String serebrig(int kolvo){
        String alphabet="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String genword="";
        for (int i=0;i<=kolvo;i++) {
            int kol=(int)(Math.random()*alphabet.length());
            genword+=alphabet.charAt(kol);
        }
        return genword;
    }
}
