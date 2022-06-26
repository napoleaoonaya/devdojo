package com.br.devdojo;

import java.util.ArrayList;
import java.util.List;

public class Generics02 {
    public static void main(String[] args) {

        //Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Midori");
        lista.add("Seite");

        for (String o: lista){
            System.out.println(o);
        }

        add(lista, new Consumidor("Goku"));

        for (String o: lista){
            System.out.println(o);
        }

        //TODO: Daria um ClassCastException no java 11

    }
//    public static void add(List lista, Consumidor nome){
//        lista.add(nome);
//    }

    public static void add(List<String> lista, Consumidor nome){
        lista.add(nome.toString());
    }
}
