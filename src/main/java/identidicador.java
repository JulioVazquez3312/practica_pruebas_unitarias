public class identidicador {
    char lm [] ={'a','b','c','d','e','f','g','h','i','j',
            'k','l','m','n','ñ','o','p','q','r','s','t',
            'u','v','w','x','y','z'};
    char lm2 [] ={'A','B','C','D','E','F','G','H','I','J',
            'K','L','M','N','Ñ','O','P','Q','R','S','T','U',
            'V','W','X','Y','Z'};
    char sim [] = {'_', '$'};
    char num [] = {0,1,2,3,4,5,6,7,8,9};
    String entrada="Av1_$";

    public void verificadorEspacios(){
        for (int i = 0; i < entrada.length() ; i++) {
            if (entrada.charAt(i) == ' ' ) {
                System.out.println("No se puede contener espacios en medio de las palabras");
            }
        }
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
        if (entrada.charAt(0) != '0'& entrada.charAt(0) !='1'
                & entrada.charAt(0) !='2'& entrada.charAt(0) !='3'& entrada.charAt(0) !='4'
                & entrada.charAt(0) !='5' & entrada.charAt(0) !='6'& entrada.charAt(0) !='7'
                & entrada.charAt(0) !='8'& entrada.charAt(0) !='9') {
            System.out.println("No se puede iniciar con numeros");
        }
    }

    public void revicion(){
        if (entrada.charAt(0) == lm[0] || entrada.charAt(0) ==lm2[0]||
                entrada.charAt(0) ==sim[0]|| entrada.charAt(0) ==num[0]) {

        }
    }
}
