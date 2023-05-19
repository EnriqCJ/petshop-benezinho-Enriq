import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaJuridica extends Pessoa{

    private String CNPJ;
    private Pessoa  pessoa;
    private Collection<Pessoa> socios = new Vector<>();

    public PessoaJuridica() {
    }

    public PessoaJuridica(String CNPJ, Pessoa pessoa, Collection<Pessoa> socios) {
        this.CNPJ = CNPJ;
        this.pessoa = pessoa;
        this.socios = socios;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }


    public Collection<Pessoa> getSocios() {
        return Collections.unmodifiableCollection(this.socios);
    }

    public PessoaJuridica addSocio(Pessoa socio) {
        this.socios.add(socio);
        return this;
    }

    public PessoaJuridica removeSocio(Pessoa socio) {
        this.socios.remove(socio);
        return this;
    }


    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + CNPJ + '\'' +
                ", pessoa=" + pessoa +
                ", socios=" + socios +
                "} " + super.toString();
    }
}
