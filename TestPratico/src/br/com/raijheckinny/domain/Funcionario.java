package br.com.raijheckinny.domain;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String salarioFormatado(){
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.GERMANY);
        return numberFormat.format(this.salario);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +" " +
                "DataDeNacimento: " + dataFormatada() + " " +
                "Salario: " + salarioFormatado() + " " +
                "Funcao: " + funcao;
    }
}
