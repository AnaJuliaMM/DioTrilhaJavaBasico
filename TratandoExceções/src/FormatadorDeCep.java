
public class FormatadorDeCep {
    public static void main(String[] args) {
        String cepFormatado;
        try {
            cepFormatado = formatarCep("23764");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
           System.out.println("Formato errado");
        }
        
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();
        return "23.765-064";
    }

    
}