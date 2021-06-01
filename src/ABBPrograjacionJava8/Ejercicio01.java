/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABBPrograjacionJava8;

import java.util.ArrayList;
import java.util.function.*;

/**
 *
 * @author enrique
 */
public class Ejercicio01 {

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
        
        System.out.println("0.------ Mostrar todos");
        modulos.forEach(System.out::println);
        
        System.out.println("1.a.------ Utilizando un predicado (predicate), muestra los módulos con más de 6 horas.");
        Predicate<Modulo> predicado = (m) -> m.getHoras() > 6; 
        for (Modulo modulo : modulos) {
            if (predicado.test(modulo)) System.out.println(modulo);   
        }
        System.out.println("1.a.------- Hago la cuenta con un stream y un filter");
        System.out.println(modulos.stream().filter(predicado).count());
        
        System.out.println("1.b.------- Utilizando una función (function), muestra el ciclo del primer módulo de la lista.");
        Function<ArrayList<Modulo>,Ciclo> funcion = (m) -> m.get(0).getCiclo();
        System.out.println(funcion.apply(modulos).getNombre());
        
        System.out.println("1.c.------- Utilizando un consumidor (consumer), cambia las siglas del tercer módulo de la lista.");
        Consumer<Modulo> consumer = (m) -> m.setSiglas("AAA");
        consumer.accept(modulos.get(2));
        
        System.out.println("1.d.------- Utilizando un proveedor (supplier), crea un módulo e imprímelo.");
        Supplier<Modulo> supplier = () -> new Modulo("Proyecto", "PFC", 0, c2);
        System.out.println(supplier.get());
        
    }

}
