package questao5;

import java.util.ArrayList;
import java.util.List;

public class AlteraString {

    public String inverteString(String palavra) {
        int beginIndex = 0, endIndex = 1;
        var palavraIntertida = new StringBuilder();
        List<String> letras = new ArrayList<String >();

        while(endIndex <= palavra.length()) {
            letras.add(palavra.substring(beginIndex, endIndex));
            beginIndex++;
            endIndex++;
        }

        int aux = palavra.length() - 1;

        while (aux >= 0){
            palavraIntertida.append(letras.get(aux));
            aux--;
        }

        return palavraIntertida.toString();
    }


}
