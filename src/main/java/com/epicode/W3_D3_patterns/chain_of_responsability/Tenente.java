package com.epicode.W3_D3_patterns.chain_of_responsability;

public class Tenente extends Militare{
    @Override
    public void azione(String azione) {
        if(azione.equalsIgnoreCase("azione tenente")){
            System.out.println("Tenente: sto eseguendo l'azione");
        } else if (prossimoMilitare != null) {
            prossimoMilitare.azione(azione);
        } else {
            System.out.println("Tenente: nessuno può eseguire questa azione");
        }
    }

    @Override
    public String getGrado() {
        return "Tenente";
    }

    @Override
    public double getStipendio() {
        return 1400;
    }
}
