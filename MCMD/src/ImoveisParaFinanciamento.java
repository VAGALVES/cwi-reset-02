import java.util.ArrayList;
import java.util.List;

public class ImoveisParaFinanciamento {

    private List<Imovel> imoveis;

    public ImoveisParaFinanciamento() {
        imoveis = new ArrayList<>();
    }

    public void registrarImovel(Imovel imovel) {

        if (imovel.getValor() >= 50000.0 && imovel.getValor() <= 1000000.0) {
            imoveis.add(imovel);
        } else {
            System.out.println("Não serão contemplados no programa os imóveis com valor de R$: "+imovel.getValor());
        }
    }

    public List<Imovel> buscarOpcoes(double valorLimite) {

        List<Imovel> opcoes = new ArrayList<>();

        for (Imovel imovel : imoveis) {
            if (imovel.getValor() <= valorLimite) {
                opcoes.add(imovel);
            }
        }

        return opcoes;
    }
}
