public class Imovel {

    private Endereco endereco;
    private Double valor;

    public Imovel(Endereco endereco, Double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Double getValor() {
        return valor;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String apresentacao() {
        return endereco.getLogradouro() + "\n* Nº: "+ endereco.getNumero()+"\n* Bairro: "+endereco.getBairro()
                + "\n* Município: "+endereco.getCidade()+"/"+endereco.getEstado();
    }
}
