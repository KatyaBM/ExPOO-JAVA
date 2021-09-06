package br.univali.kob.exercicioJava01;

import java.util.Arrays;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice fatura = new Invoice("123", "Secador de Cabelo", 4, 5.75);
        double totalFatura;
        totalFatura = fatura.getInvoiceAmount(5.75, 4);
        System.out.printf(fatura.toString());
        System.out.printf("Valor da fatura: R$ %.2f", totalFatura);
    }
}
