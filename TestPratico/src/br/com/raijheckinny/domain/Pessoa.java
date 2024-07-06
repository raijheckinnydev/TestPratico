package br.com.raijheckinny.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa{
    private String nome;
    private LocalDate dataNacimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String dataFormatada(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNacimento.format(dtf);
    }
}
