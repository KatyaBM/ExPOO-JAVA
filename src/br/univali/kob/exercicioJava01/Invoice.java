package br.univali.kob.exercicioJava01;

public class Invoice {
    private final String numero;
    private final String descricao;
    private int qtdeComprada;
    private double preco;

    public Invoice (String numero, String descricao, int qtdeComprada, double preco){
        this.numero = numero;
        this.descricao = descricao;
        if(qtdeComprada >= 0)
            this.qtdeComprada = qtdeComprada;
        if(preco >= 0)
            this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQtdeComprada() {
        return qtdeComprada;
    }

    public void setQtdeComprada(int qtdeComprada) {
        if(qtdeComprada >= 0)
            this.qtdeComprada = qtdeComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0)
            this.preco = preco;
    }
    public double getInvoiceAmount(double preco, int qtdeComprada){
        return getQtdeComprada()*getPreco();
    }

    @Override
    public String toString() {
        return "numero: " + numero + "\n" +
                "descricao: " + descricao + "\n" +
                "quantidade: " + qtdeComprada + "\n" +
                "preco: " + preco + "\n";
    }
}
