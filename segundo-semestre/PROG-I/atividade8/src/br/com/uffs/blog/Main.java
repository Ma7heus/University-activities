package br.com.uffs.blog;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date inicio =  new Date();

        for (Integer a = 0 ; a < 10000;a++){
            System.out.println(a + " Lais eu te amo");
        }

        Date fim = new Date();

        System.out.println("INICIO: " + inicio);
        System.out.println("FIM: " + fim);


    }
}
