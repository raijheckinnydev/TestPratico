package br.com.raijheckinny.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        cadastrarFuncionario("Maria", LocalDate.of(1990, 7, 5), new BigDecimal("2009.44"), "Operador", funcionarios);
        cadastrarFuncionario("João", LocalDate.of(1990,5, 12), new BigDecimal("2284.38"), "Operador", funcionarios);
        cadastrarFuncionario("Caio", LocalDate.of(1961,5, 2), new BigDecimal("9836.14"), "Coordenador", funcionarios);

        removerFuncionario("João", funcionarios);

        imprimirTodos(funcionarios);

        aumentoSalario(10, funcionarios);

        
    }

    private static void aumentoSalario(int porcentagemDeAumento, List<Funcionario> bancoDeDados) {
        for (Funcionario funcionario : bancoDeDados) {
            BigDecimal salarioAtual = funcionario.getSalario();
            BigDecimal aumento = salarioAtual.multiply(BigDecimal.valueOf(porcentagemDeAumento)).divide(BigDecimal.valueOf(100));
            BigDecimal novoSalario = salarioAtual.add(aumento);
            funcionario.setSalario(novoSalario);
        }
    }

    private static void imprimirTodos(List<Funcionario> bancoDeDados) {
        for (Funcionario funcionario : bancoDeDados) {

            System.out.println(funcionario);
        }
    }


    private static void removerFuncionario(String nome, List<Funcionario> bancoDeDados) {
        for (Funcionario funcionario : bancoDeDados) {
            if (funcionario.getNome().equals(nome)) {
                bancoDeDados.remove(nome);
            }
        }
    }

    private static void cadastrarFuncionario(String nome, LocalDate dataDeNacimento, BigDecimal salario, String funcao, List<Funcionario> bancoDeDados) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setDataNacimento(dataDeNacimento);
        funcionario.setSalario(salario);
        funcionario.setFuncao(funcao);

        bancoDeDados.add(funcionario);
    }

}
