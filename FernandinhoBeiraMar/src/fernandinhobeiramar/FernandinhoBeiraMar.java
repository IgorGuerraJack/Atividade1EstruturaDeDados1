package fernandinhobeiramar;

import java.util.Stack;

public class FernandinhoBeiraMar {

    public static String inverterPalavras(String input) {
        StringBuilder resultado = new StringBuilder();
        Stack<Character> pilha = new Stack<>();
        boolean dentroDeUmaPalavra = false;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                pilha.push(c);
                dentroDeUmaPalavra = true;
            } else {
                if (dentroDeUmaPalavra) {
                    while (!pilha.isEmpty()) {
                        resultado.append(pilha.pop());
                    }
                }
                resultado.append(c);
                dentroDeUmaPalavra = false;
            }
        }

        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop());
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        String exemplo1 = "UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String exemplo2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";

        System.out.println(inverterPalavras(exemplo1));
        System.out.println(inverterPalavras(exemplo2));
    }
}