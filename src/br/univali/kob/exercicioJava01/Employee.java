package br.univali.kob.exercicioJava01;

public class Employee {
    private String nome, sobrenome;
    private double salario;
//Construtor
    public Employee (String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public double getSalario(){
        return salario;
    }

    public double salarioMensal(double salario){
        if(salario < 0)
            salario = 0;
        else
            salario = salario * 1.10;
        return salario;
    }

    public double salarioAnual(){
        return salarioMensal(salario) * 12;
    }

    @Override
    public String toString() {
        return String.format("%n%s %s%s%s %n%s%.2f %n%s%.2f%n",
                "Nome Completo: " , getNome() , ' ' , getSobrenome(),
                "Salario Mensal: R$" , salarioMensal(salario) ,
                "Salario Anual: R$" , salarioAnual());
    }
}
