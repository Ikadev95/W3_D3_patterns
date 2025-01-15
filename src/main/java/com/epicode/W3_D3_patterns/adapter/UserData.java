package com.epicode.W3_D3_patterns.adapter;

public class UserData {
    private String nomeCompleto;
    private int eta;
    public void getData (DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
