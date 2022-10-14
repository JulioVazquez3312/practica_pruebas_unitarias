public class identidicador {
    char lm [] ={'a','b','c','d','e','f','g','h','i','j',
            'k','l','m','n','ñ','o','p','q','r','s','t',
            'u','v','w','x','y','z'};
    char lm2 [] ={'A','B','C','D','E','F','G','H','I','J',
            'K','L','M','N','Ñ','O','P','Q','R','S','T','U',
            'V','W','X','Y','Z'};
    char sim [] = {'_', '$'};
    char num [] = {'0','1','2','3','4','5','6','7','8','9'};
    String entrada="l4234234456$_";

    public identidicador() {
        letraIn();
        revicionletraMin();
        //revicionletraMay();
        revicionNum2();
        revicionSim2();
        verificadorEspacios();

    }

    public void verificadorEspacios(){
        int num=0;
        for (int i = 0; i < entrada.length() ; i++) {
            if (entrada.charAt(i) == ' ' ) {
                num++;
            }
        }
        if (num>0)
            System.out.println("Analizando...[INCORRECTO]" +
                    "\nNo se puede contener espacios en medio de las letras\n");
        else
            System.out.println("Analizando...[CORRECTO]" +
                    "\nLa cadena no contiene espacios\n");
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
            System.out.println("Analizando...[CORRECTO]" +
                    "\nContiene numeros\n");
        } else System.out.println("Analizando...[INCORRECTO]" +
                "\nNo contiene numeros\n");

    }

    public void letraIn(){
        if (entrada.charAt(0) =='l' || entrada.charAt(0) =='L'|| entrada
                .charAt(0) == '$' || entrada.charAt(0) == '_') {
            System.out.println("Analizando...[CORRECTO]" +
                    "\nInicia correcctamente\n");
        }
        else
            System.out.println("Analizando...[INCORRECTO]" +
                    "\nLa cadena no puede iniciar con caracteres que no sean l,$,_\n");
    }

    public void revicionSim(){
        if (entrada.charAt(0) == '$' || entrada.charAt(0) == '_') {
            System.out.println("Analizando...[CORRECTO] " +
                    "\nContiene los simbolos '$' '_'\n");
        } else
            System.out.println("Analizando...[INCORRECTO] " +
                    "\nLa cadena no contiene los caracteres '$' '_'\n");
    }

    public void revicionletraMin(){
        boolean flag = false;
        for (int c = 0; c < entrada.length(); c++) {
            for (int i = 0; i < lm.length-1; i++) {
                if (entrada.charAt(c) == lm[i]) {
                    flag = true;
                }
            }
        }
        if (flag == true) {
            System.out.println("Analizando...[CORRECTO]" +
                    "\nContiene minusculas\n");
        } else
            revicionletraMay();
            //System.out.println("Analizando...[INCORRECTO]" +
             //   "\nNo contiene minusculas\n");
    }

    public void revicionletraMay(){
        boolean flag = false;
        for (int c = 0; c < entrada.length(); c++) {
            for (int i = 0; i < lm2.length-1; i++) {
                if (entrada.charAt(c) == lm2[i]) {
                    flag = true;
                }
            }
        }
        if (flag == true) {
            System.out.println("Analizando...[CORRECTO]" +
                    "\nContiene MAYUSCULAS\n");
        } else System.out.println("Analizando...[INCORRECTO]" +
                "\nNo contiene LETRAS\n");
    }

    public void revicionNum2(){
        boolean flag = false;
        for (int c = 0; c < entrada.length(); c++) {
            for (int i = 0; i < num.length-1; i++) {
                if (entrada.charAt(c) == num[i]) {
                    flag = true;
                }
            }
        }
        if (flag == true) {
            System.out.println("Analizando...[CORRECTO]" +
                    "\nContiene numeros\n");
        } else System.out.println("Analizando...[INCORRECTO]" +
                "\nNo contiene numeros\n");
    }

    public void revicionSim2(){
        boolean flag1 = false;
        boolean flag2 = false;
        for (int c = 0; c < entrada.length(); c++) {
                if (entrada.charAt(c) == sim[0]) {
                    flag1 = true;
                }
                if(entrada.charAt(c) == sim[1]){
                    boolean x = flag2;
                    flag2 = true;
                }
        }
        if (flag1 == true && flag2 == true) {
            System.out.println("Analizando...[CORRECTO]" +
                    "\nContiene simbolos\n");
        } else System.out.println("Analizando...[INCORRECTO]" +
                "\nNo contiene simbolos o no todos\n");
    }

    public void revisaOtrosSimbolos() {
    }

    public void otrosSim(){
        boolean sin = false,num = false,l = false,l2 = false;
        for (int i = 0; i <entrada.length() ; i++) {
            if (entrada.charAt(i) == '0' || entrada.charAt(i) == '1'
                    || entrada.charAt(i) == '2' || entrada.charAt(i) == '3' || entrada.charAt(i) == '4'
                    || entrada.charAt(i) == '5' || entrada.charAt(i) == '6' || entrada.charAt(i) == '7'
                    || entrada.charAt(i) == '8' || entrada.charAt(i) == '9') {
                num = true;
            }

            for (int c = 0; c < lm.length - 1; c++) {
                if (entrada.charAt(i) == lm[c]) {
                    l = true;
                }
            }

            for (int c = 0; c < lm2.length - 1; c++) {
                if (entrada.charAt(i) == lm2[c]) {
                    l2 = true;
                }
            }

            if (entrada.charAt(i) == sim[0] || entrada.charAt(i) == sim[1]) {
                sin = true;
            }
            if (sin == false && num == false && l == false && l2 == false) {
                System.out.println("Analizando...[Incorrecto]" +
                        "\nNo se permiten simbolos distintos a '$' '_'");
            }
            sin = false; num = false; l = false; l2 = false;
        }

    }
    public static void main(String[] args) {
        new identidicador();
    }
}
