package br.univali.kob.exercicioJava01;

public class DateTest {
    public static void main(String[] args) {
        Date data = new Date(2,3,2021);
        data.setDia(25);
        data.setMes(02);
        data.setAno(2020);
        System.out.printf("%s: %s", "Data",data.toString());

    }
}
