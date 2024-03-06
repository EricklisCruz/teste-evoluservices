import com.evoluservices.questao1.NumerosMultiplos3e5;
import com.evoluservices.questao2.Palavra;

public class Main {
    public static void main(String[] args) {

        NumerosMultiplos3e5 numerosMultiplos3e5 = new NumerosMultiplos3e5();

        System.out.println("Múltiplos de 3 e 5");
        numerosMultiplos3e5.ticoTeco();

        String word = "Deleveled";
        String word2 = "Teste";

        Palavra palavra = new Palavra();

        System.out.println(word + " isPalindrome?: " + palavra.isPalindrome(word));
        System.out.println(word2 + " isPalindrome?: " + palavra.isPalindrome(word2));

    }

}
