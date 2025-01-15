package com.epicode.W3_D3_patterns.composite;

public class Main {
    public static void main(String[] args) {

        Pagina p1 = new Pagina(1);
        Pagina p2 = new Pagina(2);
        Pagina p3 = new Pagina(3);

        Sezione s1 = new Sezione("sezione1");
        s1.aggiungiComponent(p1);
        s1.aggiungiComponent(p2);

        Sezione s2 = new Sezione("sezione2");
        s2.aggiungiComponent(p3);

        Libro libro = new Libro(12.5,"Libro");
        libro.aggiungiComponent(s1);
        libro.aggiungiComponent(s2);

        libro.stampa();
        System.out.println("Totale pag: " + libro.numeroPagine());
    }
}
