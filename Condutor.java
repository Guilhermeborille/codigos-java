public class Condutor {
    private String nome;
    private  String cnh;
    private Carro carro;

    public Condutor(String nome,String cnh, Carro carro){
        this.nome = nome;
        this.cnh = cnh;
        this.carro = carro;
    }
    public Condutor(String nome, String cnh){
        this.nome = nome;
        this.cnh = cnh;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
