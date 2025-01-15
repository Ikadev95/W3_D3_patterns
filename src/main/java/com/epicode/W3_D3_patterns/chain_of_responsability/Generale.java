package com.epicode.W3_D3_patterns.chain_of_responsability;

public class Generale extends Militare{
    @Override
    public void azione(String azione) {
        if(azione.equalsIgnoreCase("azione generale")){
            System.out.println("Generale: sto eseguendo l'azione");
        } else {
            System.out.println("Generale: nessuno può eseguire questa azione");
        }
    }

    @Override
    public String getGrado() {
        return "Generale";
    }

    @Override
    public double getStipendio() {
        return 6000;
    }
}
