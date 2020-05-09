package challenge;

public class CriptografiaCesarianaGeral {
    private char[] alfabeto="abcdefghijklmnopqrstuvwxyz".toCharArray();
    private  char[] alfabetoM="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private  char[] espaco = " .".toCharArray();
    private   char[] numeros = "0123456789".toCharArray();
    private   int chave=3;
    public Class<IllegalArgumentException> erroEmpty(){
        throw new IllegalArgumentException();
    }
    public Class<NullPointerException> erroNull(){
        throw new  NullPointerException();
    }
    public String CriptoGenerico(String texto,String comando){
        if(texto.equals("")) erroEmpty();
        if(comando.equals("")) erroEmpty();
        if(texto.equals(null)) erroNull();
        if(comando.equals(null)) erroNull();
        char[] cezar = texto.toCharArray();
        String resultado="";
        for(int i=0;i<cezar.length;i++)
        {for(int j=0;j<alfabeto.length;j++)
        {  if (cezar[i]==espaco[0]){
            cezar[i]=espaco[0];
            resultado=resultado+cezar[i];
            break; }
            if (cezar[i]==espaco[1])
            {  cezar[i]=espaco[1];
                resultado=resultado+cezar[i];
                break;}
            if(comando=="descripto"){
                if((cezar[i])==(alfabeto[j]))
                {
                    if(j-chave<0)
                    {  cezar[i]=alfabeto[((j-chave)+26)];
                        resultado=resultado+cezar[i]; }
                    else
                    { cezar[i]=alfabeto[j-chave];
                        resultado=resultado+cezar[i];  }
                    j=0;
                    break; }
                if((cezar[i])==(alfabetoM[j]))
                { if(j-chave<0)
                { cezar[i]=alfabetoM[((j-chave)+26)];
                    resultado=resultado+cezar[i]; }
                else
                {cezar[i]=alfabetoM[j-chave];
                    resultado=resultado+cezar[i];  }
                    j=0;
                    break; }
            }
            else if(comando=="cripto"){
                if(cezar[i]==alfabeto[j])
                { if(j+chave>=26)
                { cezar[i]=alfabeto[j+chave-26];
                    resultado=resultado+cezar[i]; }
                else
                { cezar[i]=alfabeto[j+chave];
                    resultado=resultado+cezar[i]; }
                    j=0;
                    break; }
                if(cezar[i]==alfabetoM[j])
                { if(j+chave>=26)
                {  cezar[i]=alfabetoM[j+chave-26];
                    resultado=resultado+cezar[i]; }
                else
                { cezar[i]=alfabetoM[j+chave];
                    resultado=resultado+cezar[i]; }
                    j=0;
                    break;
                }
            }
        }
            for(int k =0;k<numeros.length;k++){
                if(cezar[i]== numeros[k]){
                    cezar[i]=numeros[k];
                    resultado=resultado+cezar[i];}}
        }
        return resultado.toLowerCase();
    }

}
