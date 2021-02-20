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
                imprimirPropostaAprovada();
            } else {
                imprimirPropostaNegada();
            }
        } else if (UnidadeFederativa.RJ.equals(imovel.getEndereco().getEstado())) {
            if (beneficiario.getSalario() * prazoDoFinanciamento >= imovel.getValor() * 0.6) {
                imprimirPropostaAprovada();
            } else {
                imprimirPropostaNegada();
            }
        } else {
            if (beneficiario.getSalario() * prazoDoFinanciamento >= imovel.getValor() * 0.5) {
                imprimirPropostaAprovada();
            } else {
                imprimirPropostaNegada();
            }
        }

    }

    private void imprimirPropostaAprovada() {
        System.out.println("PROPOSTA APROVADA! Subiu o nível");
        System.out.println("\n* Sortudo: "+beneficiario.getNome()+"\n* Imóvel: "+imovel.getEndereco()+"\n* Prazo: "+prazoDoFinanciamento+" meses.");
    }

    private void imprimirPropostaNegada() {
        System.out.println("Deum ruim, PROPOSTA NEGADA! Fracassado, nem isso você consegue!");
        System.out.println("\n* Fracassado: "+beneficiario.getNome()+"\n* Imóvel: "+imovel.getEndereco()+"\n* Prazo: "+prazoDoFinanciamento+" meses.");
    }
}