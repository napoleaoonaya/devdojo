package com.br.devdojo;

import java.util.ArrayList;
import java.util.List;

public class Generics01 {
    public static void main(String[] args) {

        List lista = new ArrayList<>();
        lista.add("Midori");
        lista.add(123L);
        lista.add(new Consumidor("Goku"));

        for (Object o: lista){
            if(o instanceof String){
                System.out.println(o);
            }
            if(o instanceof Long){
                System.out.println(o);
            }
            if(o instanceof Consumidor){
                System.out.println(o);
            }
        }
    }
}
