package com.epicode.W3_D3_patterns.adapter;

import lombok.Data;

import java.util.Date;

@Data
public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;
    public String getNome() { return nome;}
    public void setNome(String nome) { this.nome = nome; }
    public String getCognome() { return cognome;}
    public void setCognome(String cognome) { this. cognome = cognome; }
    public Date getDataDiNascita() { return dataDiNascita;}
    public void DataDiNascita (Date dataDiNascita) { this. dataDiNascita = dataDiNascita;}

}
