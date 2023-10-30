public class Turista {
    // Atributo
    private String nome;
    private String cpf;

    // Construtor Padrão
    Turista(){

    }
    // Sobrecarga do construtor
    Turista(String nome){
        this.nome = nome;
    }

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
}
