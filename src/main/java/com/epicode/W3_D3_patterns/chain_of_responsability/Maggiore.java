package com.epicode.W3_D3_patterns.chain_of_responsability;

public class Maggiore extends Militare{
    @Override
    public void azione(String azione) {
        if(azione.equalsIgnoreCase("azione maggiore")){
            System.out.println("Maggiore: sto eseguendo l'azione");
        } else if (prossimoMilitare != null) {
            prossimoMilitare.azione(azione);
        } else {
            System.out.println("Maggiore: nessuno può eseguire questa azione");
        }
    }

    @Override
    public String getGrado() {
        return "Maggiore";
    }

    @Override
    public double getStipendio() {
        return 3000;
    }
}
