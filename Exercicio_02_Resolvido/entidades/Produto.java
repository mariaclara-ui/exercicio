package Exercicio_02_Resolvido.entidades;

public class Produto {
    private int QuantoProdu;
    private String nome;
    private Double preco;

    public Produto(String nome,Double preco,int QuantoProdu) {
        this.nome=nome;
        this.preco = preco;
        this.QuantoProdu=QuantoProdu;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public int getQuantoProdu() {
        return QuantoProdu;
    }
    public void setQuantoProdu(int quantoProdu) {
        QuantoProdu = quantoProdu;
    }
}
