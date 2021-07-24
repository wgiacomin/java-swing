package beans.cliente;

import beans.veiculos.VeiculoAbstract;
import java.util.ArrayList;
import java.util.List;

public class Cliente {;
    private String nome;
    private String rg;
    private String cpf;
    private String endereco;
    private String sobrenome;
    private List<VeiculoAbstract> listaDeLocacao = new ArrayList<>();

    public Cliente(String nome, String sobrenome, String rg, String cpf, String endereco) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sobrenome = sobrenome;
    }
    
    public void locar(VeiculoAbstract veiculo){
        this.listaDeLocacao.add(veiculo);
    }
    
    public void devolver(VeiculoAbstract veiculo){
        this.listaDeLocacao.remove(veiculo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getVeiculosLocados(){
        return this.listaDeLocacao.size();
    }
}
