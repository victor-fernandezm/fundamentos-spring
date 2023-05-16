package com.softtek.fundamentos_spring.model;

import org.springframework.stereotype.Component;

@Component
public interface ITaller {
    public void reparar(Coche c);
}
