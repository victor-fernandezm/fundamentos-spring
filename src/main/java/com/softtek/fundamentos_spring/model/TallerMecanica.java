package com.softtek.fundamentos_spring.model;

import org.springframework.stereotype.Component;


public class TallerMecanica implements ITaller {
    @Override
    public void reparar(Coche c) {
        System.out.println("Reparando coche: " + c.getMatricula());
    }
}
