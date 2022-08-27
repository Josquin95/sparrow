package com.doveracing.sparrow.Movimientos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplements implements ComponentDependecy{
    @Override
    public void saludar() {
        System.out.println("Hola mundo desde mi componente dos");
    }
}
