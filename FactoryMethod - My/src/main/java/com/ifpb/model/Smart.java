package com.ifpb.model;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 23/01/2020, 15:40:18
 */
public class Smart extends FactoryCar {

    @Override
    public Carro criar(String tipo) {
//        if ("fusca".equals(tipo)) {
//            return new Fusca();
//        }
        return new Caminhao();
    }

}
