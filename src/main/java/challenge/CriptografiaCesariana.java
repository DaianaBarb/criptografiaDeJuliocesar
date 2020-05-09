package challenge;




    public class CriptografiaCesariana implements Criptografia {
        CriptografiaCesarianaGeral geral = new CriptografiaCesarianaGeral();

        @Override
        public String criptografar(String texto) {
return geral.CriptoGenerico(texto,"cripto");
        }
        @Override
        public String descriptografar(String texto) {

            return geral.CriptoGenerico(texto,"descripto");
        }

}
