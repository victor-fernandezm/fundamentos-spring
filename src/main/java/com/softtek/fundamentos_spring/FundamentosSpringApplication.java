package com.softtek.fundamentos_spring;

import com.softtek.fundamentos_spring.model.Coche;
import com.softtek.fundamentos_spring.model.SeguroCoche;
import com.softtek.fundamentos_spring.model.TallerPintura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosSpringApplication implements CommandLineRunner {
    @Autowired
    private SeguroCoche s1;

    public static void main(String[] args) {
        SpringApplication.run(FundamentosSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TallerPintura t = new TallerPintura();
        s1.setTaller(t);
        Coche c1 = new Coche("1234ABC", "Toyota AE 86");
        s1.reparar(c1);
    }
}
