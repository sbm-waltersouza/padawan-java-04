package src.br.com.bytebank.banco.modelo;
//arrumando estrutura
/**
 * Classe que representa um cliente no Bytebank 
 * 
 * @author André Chaves
 * @version 0.1
 */
public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
