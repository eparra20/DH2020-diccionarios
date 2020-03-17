package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----Diccionarios------");
        /**
         * Es como un array
         * Es una coleccion de elementos
         * Tiene pares de valores.
         * */

        //CLAVES y VALORES-
        //Procastinar , "La definicacion de la palabra procastinar";

        List<Integer> listaDeEnteros = new ArrayList<>();
        Map<Integer,Integer> diccionario = new HashMap<>();
        listaDeEnteros.add(33321321); // necesito hacer .get(0)
        diccionario.put(0,33321321); //necesito hacer .get(0)
        diccionario.put(100,5); //necesito hacer .get(100)
        diccionario.put(100,40);
        //dame el valor de la KEY 100
        System.out.println(diccionario.get(100));
        System.out.println("------Diccionario de String y Object---------");

        Map<String,Object> otroDiccionario = new HashMap<>();
        otroDiccionario.put("cargo","profesor");
        otroDiccionario.put("edad",26);
        otroDiccionario.put("nombre","edu");
        Animal unAnimal = new Animal();
        otroDiccionario.put("mascota",unAnimal);

        //casteo
        Integer edadEdu = (Integer) otroDiccionario.get("edad");

        Animal mascota = (Animal) otroDiccionario.get("mascota");
        mascota.comer();



        Map<Integer,List<Prenda>> armario = new HashMap<>();


        Prenda unaPrenda = new Prenda("Adidas","Ultra");

        List<Prenda> listaPrendas = new ArrayList<>();
        listaPrendas.add(unaPrenda);

        List<Prenda> prendaArrayList = new ArrayList<>();

        armario.put(1,listaPrendas);

        armario.put(2,prendaArrayList);

        System.out.println("Imprimiendo prendas");
        System.out.println(armario.get(1));

        System.out.println("---------equals-----------");

        Integer a = 1;
        Integer b = new Integer(1);
        Prenda prendaAComparar = new Prenda("Adidas","Ultra");
        Prenda otraPrenda = new Prenda("Adidas","Ultra");

        //compara memoria
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println("Comparandos prendas");
        System.out.println(otraPrenda.equals(prendaAComparar));
        System.out.println(otraPrenda.equals(3));
        //listaPrendas.contains()


    }
}
