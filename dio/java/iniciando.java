public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Wellington";
        String segundoNome = "Xavier";

        // Corrigido: passando dois argumentos para o método nomeCompleto
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto); // Corrigido: adicionando o ponto e vírgula
    }    

    // Corrigido: o método nomeCompleto agora aceita dois parâmetros e retorna a string completa
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome + " " + segundoNome; // Corrigido: concatenando os dois nomes com um espaço
    }
}
