/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABBPrograjacionJava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.*;

/**
 *
 * @author enrique
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Ciclo c1 = new Ciclo("SMR");
        Ciclo c2 = new Ciclo("DAM");
        ArrayList<Modulo> modulos = new ArrayList<>();

        modulos.add(new Modulo("Aplicaciones Web", "AW", 5, c1));
        modulos.add(new Modulo("Redes", "R", 7, c1));
        modulos.add(new Modulo("Servicios de red", "SR", 6, c1));
        modulos.add(new Modulo("Seguridad", "S", 5, c1));

        modulos.add(new Modulo("Programación", "P", 8, c2));
        modulos.add(new Modulo("Bases de datos", "BD", 6, c2));
        modulos.add(new Modulo("Programación de servicios y procesos", "PSP", 4, c2));
        modulos.add(new Modulo("Sistemas de gestion empresarial", "SGE", 4, c2));

        System.out.println("2.a.--------- Mostrar todos los módulos");
        //modulos.forEach(System.out::println);
        modulos.stream().forEach(m-> System.out.println(m.toString()));

        System.out.println("2.b.--------- Mostrar todos los módulos que comienzan por la S");
//        modulos.stream().forEach(m -> {
//            if (m.getNombre().startsWith("S")) System.out.println(m.toString());
//        });
        modulos.stream().filter(m -> m.getNombre().startsWith("S")).forEach(m->System.out.println(m.toString()));
    
        System.out.println("2.c.--------- Contar todos los módulos");
        System.out.println(modulos.stream().count());
        
        System.out.println("2.d.--------- Mostrar todos los módulos de Sistemas Microinformáticos y redes con más de 6 horas.");
        modulos.stream().filter(m -> m.getHoras() > 6 && m.getCiclo().getNombre().equals("SMR")).forEach(m -> System.out.println(m.toString()));
        
        System.out.println("2.e.--------- Mostrar los dos primeros módulos de la lista utilizando limit");
        modulos.stream().limit(2).forEach(m->System.out.println(m.toString()));
        
        System.out.println("2.f.--------- Mostrar el primer módulo de la lista sin utilizar limit");
        System.out.println(modulos.stream().findFirst().toString());

        System.out.println("2.g.--------- Mostrar el módulo con más horas de docencia");
        Comparator<Modulo> comparador =(o1, o2) -> {
            return o2.getHoras() - o1.getHoras(); 
        };
        System.out.println(modulos.stream().sorted(comparador).findFirst());
        
        System.out.println("2.h.--------- Mostrar el módulo con menos horas de docencia");
        Comparator<Modulo> comparador2 =(o1, o2) -> {
            return o1.getHoras() - o2.getHoras(); 
        };
        System.out.println(modulos.stream().sorted(comparador2).findFirst());
        
        System.out.println("2.i.--------- Mostrar módulos cuyas siglas empiezan por “S”.");
        modulos.stream().filter(m -> m.getSiglas().startsWith("S")).forEach(m -> System.out.println(m.toString()));
        
        System.out.println("2.j.--------- Mostrar módulos cuyo nombre contiene la palabra “web”.");
        modulos.stream().filter(m -> m.getNombre().toUpperCase().contains("WEB")).forEach(m -> System.out.println(m.toString()));
        
        System.out.println("2.k.--------- Mostrar módulos cuyo nombre tenga una longitud mayor a 20 letras.");
        modulos.stream().filter(m -> m.getNombre().length()>20).forEach(m -> System.out.println(m.toString()));
        
        System.out.println("2.l.--------- Mostrar módulos cuyo nombre empiece por “S” y tengan una longitud de 18 letras.");
        modulos.stream().filter(m -> m.getNombre().startsWith("S") && m.getNombre().length()==18).forEach(m -> System.out.println(m.toString()));
        

    }

}
