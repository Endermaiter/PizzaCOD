package com.marcos.company;

import java.util.Locale;

import static com.marcos.company.Pizzas.MEDIUM;
import static com.marcos.company.Pizzas.PAN;

public class Main {

    public static void main(String[] args) {
    //instancio Builder
    BuilderPizzas miBuilder = new BuilderPizzas();

    BuilderPizzas miBuilder2 = miBuilder.setTipoMasa(PAN);

    BuilderPizzas miBuilder3 = miBuilder2.setTipo(MEDIUM);

    /*
    Sintaxis encadenada:
    Pizzas miPizza = new BuilderPizzas()
                        .setMasa(PAN)
                        .setSize(SMALL)
                        .build();

     */
    //Al final construyo la pizza
    Pizzas creadaConBuilder = miBuilder.build();
    
        System.out.println(creadaConBuilder.toString());
    }
}
