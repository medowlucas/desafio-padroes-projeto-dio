public class ConexaoBanco {

    private volatile static ConexaoBanco conexao;

    private ConexaoBanco(){}

    public static ConexaoBanco getInstance(String string){

        if( conexao == null ){
            synchronized( ConexaoBanco.class ){
                if( conexao == null ) {
                    System.out.println("Instance do Singleton > " + string);
                    conexao = new ConexaoBanco();
                }
            }
        }
        return conexao;
    }

}
