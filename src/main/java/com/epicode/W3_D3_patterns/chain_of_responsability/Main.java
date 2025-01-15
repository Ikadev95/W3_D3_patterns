package com.epicode.W3_D3_patterns.chain_of_responsability;

public class Main {
    public static void main(String[] args) {
        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();

        tenente.setProssimoMilitare(capitano);
        capitano.setProssimoMilitare(maggiore);
        maggiore.setProssimoMilitare(colonnello);
        colonnello.setProssimoMilitare(generale);

        tenente.azione("azione tenente");
        capitano.azione("azione capitano");
        maggiore.azione("azione maggiore");
        colonnello.azione("azione colonnello");
        generale.azione("azione generale");
        tenente.azione("azione maggiore");

        System.out.println("Stipendi: ");
        Militare[] militari = {tenente, capitano, maggiore, colonnello, generale};
        for (Militare militare: militari){
            System.out.println(militare.getGrado() + " euro " + militare.getStipendio() );
        }
    }
}
