package com.softtek.fundamentos_spring.model;

import org.springframework.stereotype.Component;


public class TallerPintura implements ITaller {
    @Override
    public void reparar(Coche c) {
        System.out.println("Pintando coche: " + c.getMatricula());
    }
}
