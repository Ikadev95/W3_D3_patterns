package com.epicode.W3_D3_patterns.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Sezione implements LibroComponent{
    private String titolo;
    private List<LibroComponent> components = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungiComponent(LibroComponent c){
        components.add(c);
    }

    @Override
    public int numeroPagine() {
        return components.stream().mapToInt(LibroComponent::numeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (LibroComponent component : components){
            component.stampa();
        }
    }
}
