public class PropostaFinanciamento {

    private Beneficiario beneficiario;
    private Imovel imovel;
    private Integer prazoDoFinanciamento;

    public PropostaFinanciamento(Beneficiario cliente, Imovel imovelASerAvaliado, Integer mesesAPagar) {
        this.beneficiario = cliente;
        this.imovel = imovelASerAvaliado;
        this.prazoDoFinanciamento = mesesAPagar;
    }

    public void validarProposta() {

        if (UnidadeFederativa.SP == imovel.getEndereco().getEstado()) {
            if (beneficiario.getSalario() * prazoDoFinanciamento >= imovel.getValor() * 0.65) {
                PropostaAprovada();
            } else {
                PropostaNegada();
            }
        } else if (UnidadeFederativa.RJ.equals(imovel.getEndereco().getEstado())) {
            if (beneficiario.getSalario() * prazoDoFinanciamento >= imovel.getValor() * 0.6) {
                PropostaAprovada();
            } else {
                PropostaNegada();
            }
        } else {
            if (beneficiario.getSalario() * prazoDoFinanciamento >= imovel.getValor() * 0.5) {
                PropostaAprovada();
            } else {
                PropostaNegada();
            }
        }

    }

    private void PropostaAprovada() {
        System.out.println("PROPOSTA APROVADA! Parabéns, subiu o nível!");
        System.out.println("\n* Sortudo: "+beneficiario.getNome()+"\n* Imóvel: "+imovel.getEndereco()+"\n* Prazo: "+prazoDoFinanciamento+" meses.");
    }

    private void PropostaNegada() {
        System.out.println("Deu ruim, PROPOSTA NEGADA! Fracassado, nem isso você consegue!");
        System.out.println("\n* Fracassado: "+beneficiario.getNome()+"\n* Imóvel: "+imovel.getEndereco()+"\n* Prazo: "+prazoDoFinanciamento+" meses.");
    }
}