import java.util.Collection;
import java.util.Set;

public class Main {
    public static Documento  novaDocumento(int id, String numero){

        Documento dct = new Documento();
        dct.setId(id);
        dct.setNumero(numero);
        return dct;
    }
    
    public static Animal Animal(Long id, String nome, String raca, String descricao, String observacao){
        Animal animal = new Animal();
        animal.setDescricao(descricao); 
        animal.setId(id);
        animal.setNome(nome);   
        animal.setRaca(raca);
        animal.setObservacao(observacao);
        return animal;
    }
    
    public static void Servico(int id, String nome, double valor, String descricao, String observacao) {

        Servico servico = new Servico();
        servico.setDescricao(descricao);
        servico.setObservacao(observacao);
        servico.setId(id);
        servico.setNome(nome);
        servico.setValor(valor);
    }

    public static Pessoa Pessoa(Long id) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(id);
        return pessoa;
    }

    public static PessoaFisica PessoaFisica(String CPF, Set<PessoaFisica> filho){
        PessoaFisica pf = new PessoaFisica();
        pf.setCPF(CPF);
        pf.addFilho((PessoaFisica) filho);
        return pf;
    }

    public void PessoaJuridica(String CNPJ, Pessoa pessoa, Collection<Pessoa> socios){
        PessoaJuridica pj = new PessoaJuridica();
        pj.setCNPJ(CNPJ);
        pj.addSocio((Pessoa) socios);
    }

    public static Sexo sexo(String sexo){
        Sexo sx = new Sexo();
        sx.setSexo(String.valueOf(sexo));
        return sx;
    }

    //-----------------





}