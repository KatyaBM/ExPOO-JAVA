package br.univali.kob.exercicioJava01;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, sobrenome, nome2, sobrenome2;
        double salario, salario2;
        Employee empregado1 = new Employee("", "", 0.0);
        Employee empregado2 = new Employee("", "", 0.0);

        System.out.println("Informe os dados do empregado1 ");
        System.out.printf("Nome: ");
        nome = entrada.nextLine();
        empregado1.setNome(nome);
        System.out.printf("Sobrenome: ");
        sobrenome = entrada.nextLine();
        empregado1.setSobrenome(sobrenome);
        System.out.printf("Salario: ");
        salario = entrada.nextDouble();
        empregado1.setSalario(salario);
        entrada.nextLine();//clearBuffer(entrada);
        System.out.println("Informe os dados do empregado2 ");
        System.out.printf("Nome: ");
        nome2 = entrada.nextLine();
        empregado2.setNome(nome2);
        System.out.printf("Sobrenome: ");
        sobrenome2 = entrada.nextLine();
        empregado2.setSobrenome(sobrenome2);
        System.out.printf("Salario: ");
        salario2 = entrada.nextDouble();
        empregado2.setSalario(salario2);

        System.out.printf("%s: %s", "Relatorio1 ", empregado1.toString());
        System.out.printf("%s: %s", "Relatorio2 ", empregado2.toString());
    }

}
