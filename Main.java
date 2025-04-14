public class Main {
    public static void main(String[] args){
        Condutor motora1 = new Condutor("gui", "cnh");
        Motor motor1 = new Motor("gasosa" , "145 cv");
        Motor motor2 = new Motor ("eletrico", "135 cv");
        Carro carro1 = new Carro("fiat", "kwid" , "ab123", motor1, motora1);

    }
}
