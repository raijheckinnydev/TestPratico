package br.com.raijheckinny.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        cadastrarFuncionario("Maria", LocalDate.of(1990, 7, 5), new BigDecimal("2009.44"), "Operador", funcionarios);
        cadastrarFuncionario("João", LocalDate.of(1990,5, 12), new BigDecimal("2284.38"), "Operador", funcionarios);
        cadastrarFuncionario("Caio", LocalDate.of(1961,5, 2), new BigDecimal("9836.14"), "Coordenador", funcionarios);
        
    }

    private static void cadastrarFuncionario(String nome, LocalDate dataDeNacimento, BigDecimal salario, String funcao, List<Funcionario> bancoDeDados) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setDataNacimento(dataDeNacimento);
        funcionario.setSalario(salario);
        funcionario.setFuncao(funcao);
    }
}
