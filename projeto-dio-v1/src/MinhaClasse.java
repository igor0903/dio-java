public class MinhaClasse {
    
    public static void main(String[] args) { // metodo da classe MINHA
        final String BR = "Brasil"; 
        
        String meuNome = "Igor";
        int anoFabricacao = 1930;
        boolean verdade = true;

        String primeiroNome = "Jonas ";
        String sobrenome = "Esticado";

        String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String sobrenome){
        return primeiroNome.concat(sobrenome);
    }

}
