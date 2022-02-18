package com.marcos.company;

public class BuilderPizzas {

    private Pizzas _pizza = new Pizzas();

    public Pizzas build(){
        return _pizza;
    }

    public BuilderPizzas(){
        _pizza = new Pizzas();
    }

    public BuilderPizzas setTipoMasa(int masa){
        _pizza.setMasa(masa);
        return this;
    }

    public BuilderPizzas setTipo(int tipo){
        _pizza.setTamaño(1);
        return this;
    }
}
