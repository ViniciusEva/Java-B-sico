//Todo programa em java precise estar dentro de uma classe
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        String primeiroNome = "Vinicius";
        String segundoNome = "Evangelista";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
