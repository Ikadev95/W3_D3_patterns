package com.epicode.W3_D3_patterns.chain_of_responsability;

public class Capitano extends Militare{
    @Override
    public void azione(String azione) {
        if(azione.equalsIgnoreCase("azione capitano")){
            System.out.println("Capitano: sto eseguendo l'azione");
        } else if (prossimoMilitare != null) {
            prossimoMilitare.azione(azione);
        } else {
            System.out.println("Capitano: nessuno può eseguire questa azione");
        }
    }

    @Override
    public String getGrado() {
        return "Capitano";
    }

    @Override
    public double getStipendio() {
        return 1800;
    }
}
