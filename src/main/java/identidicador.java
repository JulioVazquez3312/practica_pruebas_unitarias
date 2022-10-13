public class identidicador {
    char lm [] ={'a','b','c','d','e','f','g','h','i','j',
            'k','l','m','n','ñ','o','p','q','r','s','t',
            'u','v','w','x','y','z'};
    char lm2 [] ={'A','B','C','D','E','F','G','H','I','J',
            'K','L','M','N','Ñ','O','P','Q','R','S','T','U',
            'V','W','X','Y','Z'};
    char sim [] = {'_', '$'};
    char num [] = {'0','1','2','3','4','5','6','7','8','9'};
    String entrada="L_$aaA_56()6_Av_$";

    public identidicador() {
        revicionNum();
        verificadorEspacios();
        letraIn();
    }

    public void verificadorEspacios(){
        int num=0;
        for (int i = 0; i < entrada.length() ; i++) {
            if (entrada.charAt(i) == ' ' ) {
                num++;
            }
        }
        if (num<0)
            System.out.println("No se puede contener espacios en medio de las letras");
        else
            System.out.println("Esta bien sin espacios");
    }

    public void verificadorLetras(){

    }

    public int cicloLetra(){
        int l;
        for (l = 0; l < 27; l++) {
        }
        return l;
    }
    public int cicloNum(){
        int n;
        for (n = 0; n < 9 ; n++) {
        }
        return n;
    }

    public int cicloSim(){
        int s;
        for (s = 0; s < 1; s++) {
        }
        return s;
    }

    public void revicionNum(){
        boolean flag = false;
        for (int i = 1; i <entrada.length()-1 ; i++) {
            if (entrada.charAt(i) == '0'|| entrada.charAt(i) =='1'
                || entrada.charAt(i) =='2'|| entrada.charAt(i) =='3'|| entrada.charAt(i) =='4'
                    || entrada.charAt(i) =='5' || entrada.charAt(i) =='6' || entrada.charAt(i) =='7'
                    || entrada.charAt(i) =='8'& entrada.charAt(i) =='9' ) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("Contiene numero");
        } else System.out.println("No contiene numero");

    }

    public void letraIn(){
        if (entrada.charAt(0) =='l' || entrada.charAt(0) =='L'|| entrada
                .charAt(0) == '$' || entrada.charAt(0) == '_') {
            System.out.println("Inicia correcctamente");
        }
        else
            System.out.println("La cadena no puede iniciar con caracteres que no sean l,$,_");
    }

    public void revicion(){
        if (entrada.charAt(0) == lm[0] || entrada.charAt(0) ==lm2[0]||
                entrada.charAt(0) ==sim[0]|| entrada.charAt(0) ==num[0]) {

        }
    }

    public static void main(String[] args) {
        new identidicador();
    }
}
