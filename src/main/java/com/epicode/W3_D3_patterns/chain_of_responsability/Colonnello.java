package com.epicode.W3_D3_patterns.chain_of_responsability;

public class Colonnello extends Militare{
    @Override
    public void azione(String azione) {
        if(azione.equalsIgnoreCase("azione colonnello")){
            System.out.println("Colonnello: sto eseguendo l'azione");
        } else if (prossimoMilitare != null) {
            prossimoMilitare.azione(azione);
        } else {
            System.out.println("Colonnello: nessuno può eseguire questa azione");
        }
    }

    @Override
    public String getGrado() {
        return "Colonnello";
    }

    @Override
    public double getStipendio() {
        return 4200;
    }
}
