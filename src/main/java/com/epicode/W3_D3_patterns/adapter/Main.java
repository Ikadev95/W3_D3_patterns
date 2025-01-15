package com.epicode.W3_D3_patterns.adapter;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        info.setDataDiNascita(new Date(90, 5, 15));


        DataSource adapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(adapter);


        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());

    }
}
