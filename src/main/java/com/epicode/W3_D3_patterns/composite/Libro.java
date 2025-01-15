package com.epicode.W3_D3_patterns.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Libro implements LibroComponent{
    private List<Autore> listaAutori = new ArrayList<>();
    private double prezzo;
    private String titolo;
    private List<LibroComponent> components = new ArrayList<>();

    public Libro(double prezzo, String titolo) {
        this.prezzo = prezzo;
        this.titolo = titolo;
    }

    public void aggiungiComponent(LibroComponent c){
        components.add(c);
    }

    @Override
    public int numeroPagine() {
        return components.stream().mapToInt(LibroComponent ::numeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println("Libro: " + titolo );
        System.out.println("Prezzo:" + prezzo);
        for (LibroComponent c : components){
            c.stampa();
        }
    }
}
