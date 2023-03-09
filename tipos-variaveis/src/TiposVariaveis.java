public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 127;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98765432109L;
        float pi = 3.14F;
        double salarioMinimo = 2500.33;

        /*
         * Variaveis sao mutáveis:
         */
        int numero = 4;
        numero = 11;
        System.out.println(numero);

        /* Enquanto variáveis podem mudar seus valores ao longo
         * do código, as contantes não podem, devendo serem
         * representadas em caixa alta e com a palagra reservada
         * final, seguida do tipo.
         */
        final double VALOR_DE_PI = 3.14;

        



    }
}
