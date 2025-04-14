public class Motor {
    private String tipo;
    private String potencia;
    private Carro carro;

    public Motor(String tipo, String potencia, Carro carro){
        this.tipo = tipo;
        this.potencia = potencia;
        this.carro = carro;
    }
    public Motor(String tipo, String potencia){
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getPotencia() {
        return potencia;
    }
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    
}
