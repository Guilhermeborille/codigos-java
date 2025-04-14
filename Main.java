public class Main {
    public static void main(String[] args){
        Condutor motorista1 = new Condutor("gui", "cnh");
        Motor motor1 = new Motor("gasolina" , "145 cv");
        Motor motor2 = new Motor ("eletrico", "135 cv");
        Carro carro1 = new Carro("fiat", "kwid" , "ab123", motor1, motorista1);
        Carro carro2 = new Carro("BMW", "BMW 320i M Sport", "CHT76A", motor2);

        System.out.println(carro1.toString());
        System.out.println(carro2.toString());

    }
}
