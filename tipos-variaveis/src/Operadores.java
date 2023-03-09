public class Operadores {
    public static void main(String[] args) {
        /* Operador '+' faz concatenação quando tratar-se de string */
        String nomeCompleto = "Laura" + "Andrade";
        System.out.println(nomeCompleto);

        /* Analisando o comportamento: */
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        /* Foi observado anteriormente que, depois de detectar a primeira concatenacao,
         ele despreza as somas seguintes. A solução é utilizar evidências, fornecendo
         ao código a prioridade no algoritmo */
        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        /* Operador Ternário */
        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso"; 


    }
}
