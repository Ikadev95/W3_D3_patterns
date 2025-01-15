package com.epicode.W3_D3_patterns.composite;

import lombok.Data;

@Data
public class Pagina implements LibroComponent{
    private int numeroPagina;

    public Pagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    @Override
    public int numeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina n°: " + numeroPagina);
    }
}
