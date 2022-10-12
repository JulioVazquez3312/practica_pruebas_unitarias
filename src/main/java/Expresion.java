public class Expresion {
    String entrada = "1deded123123";
    char[] convierte;
    char[] numeros = {'0','1','2','3','4','5','6','7','8','9'};

    public static void main(String[] args) {
        new Expresion();
    }

    public void entradaConvierteChar(){
       convierte= entrada.toCharArray();
    }
    public Expresion() {
        entradaConvierteChar();
        comparaNumeros();
    }

    public void comparaNumeros(){
        for (int i = 0; i < numeros.length; i++) {
            if (convierte[0] == numeros[i])
                noCumple();

        }
    }
    public void noCumple(){
        System.out.println("No es valido");
    }
    public void siCumple(){
        System.out.println("Si es valido");
    }
}
