package actresucrsiva;

public class ActResucrsiva {

    public static void main(String[] args) {
        //Sumar hasta N
        int n= 5;
        int resultado= SumaHastaN(n);
        System.out.println(resultado);
        
        //Invertir String
        String texto= "Shane";
        String Rtexto= InvertirString(texto);
        System.out.println(Rtexto);
        
        
        //Contar Digitos
        int d= 10357;
        int Dresultado= ContarDigitos(d);
        System.out.println(Dresultado);
    }
    
    public static int SumaHastaN(int n){
        if (n<=1){
            return 1;
        }
        return n + SumaHastaN(n-1);
    } 
    
    public static String InvertirString(String texto){
        if (texto==null || texto.length() <=1){
            return texto;
        }
        return texto.charAt(texto.length() -1) + InvertirString(texto.substring(0, texto.length() -1));
    }
    
    public static int ContarDigitos(int d){
        d= Math.abs(d);
        
        if (d<10){
            return 1;
        }
        return 1 + ContarDigitos(d/10);
    }
    
}
