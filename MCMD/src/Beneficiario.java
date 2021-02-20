public class Beneficiario {

    private String nomeDoBeneficiario;
    private Double salarioDoBeneficiario;

    public Beneficiario(String nomeBeneficiario, Double salarioDoBeneficiario) {
        this.nomeDoBeneficiario = nomeDoBeneficiario;
        this.salarioDoBeneficiario = salarioDoBeneficiario;
    }

    public String getNome() {
        return nomeDoBeneficiario;
    }

    public Double getSalario() {
        return salarioDoBeneficiario;
    }

    public void setNome(String nome) {
        this.nomeDoBeneficiario = nome;
    }

    public void setSalario(Double salario) {
        this.salarioDoBeneficiario = salario;
    }
}