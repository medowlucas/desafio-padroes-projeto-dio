public class Principal {
    public static void main(String[] args) {

        ConexaoBanco acesso1 = ConexaoBanco.getInstance("Conexão n1");
        ConexaoBanco acesso2 = ConexaoBanco.getInstance("Conexão n2");  // Este teste não deve aparecer no singleton
        ConexaoBanco acesso3 = ConexaoBanco.getInstance("Conexão n3");  // Este teste não deve aparecer no singleton
    }
}
