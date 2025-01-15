package com.epicode.W3_D3_patterns.chain_of_responsability;

public abstract class Militare {
    protected Militare prossimoMilitare;

    public void setProssimoMilitare(Militare prossimoMilitare){
        this.prossimoMilitare = prossimoMilitare;
    }

    public abstract void azione(String azione);
    public abstract String getGrado();
    public abstract double getStipendio();
}
