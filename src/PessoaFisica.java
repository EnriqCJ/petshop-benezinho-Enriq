import java.util.LinkedHashSet;
import java.util.Set;

public class PessoaFisica extends Pessoa {

    private String CPF;
    private Set<PessoaFisica> filho = new LinkedHashSet<>();

    public PessoaFisica removeFilho(PessoaFisica filho){
        this.filho.remove(filho);
        return this;
    }
    public PessoaFisica addFilho(PessoaFisica filho){
        this.filho.add(filho);
        return  this;
    }

    public PessoaFisica() {
        this.CPF = CPF;
        this.filho = filho;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Set<PessoaFisica> getFilho() {
        return filho;
    }

    public void setFilho(Set<PessoaFisica> filho) {
        this.filho = filho;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CPF='" + CPF + '\'' +
                ", filho=" + filho +
                '}';
    }
}
