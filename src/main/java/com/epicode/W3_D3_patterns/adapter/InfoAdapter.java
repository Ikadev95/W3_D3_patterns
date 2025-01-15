package com.epicode.W3_D3_patterns.adapter;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {this.info = info;}

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        return calcolaEta(info.getDataDiNascita());
    }

    private int calcolaEta(Date dataDiNascita) {
        LocalDate oggi = LocalDate.now();
        LocalDate nascita = dataDiNascita.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        return Period.between(nascita, oggi).getYears();
    }
}