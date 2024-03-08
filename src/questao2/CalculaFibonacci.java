package questao2;

public class CalculaFibonacci {

    public boolean verificaFibonnaci(int numeroComparado) {
        int numeroAnterior = 0, numeroPosterior = 1;

        while (numeroAnterior < numeroComparado && numeroPosterior < numeroComparado) {
            numeroAnterior += numeroPosterior;
            numeroPosterior += numeroAnterior;
        }

        if (numeroAnterior == numeroComparado || numeroPosterior == numeroComparado)
            return true;
        else
            return false;
    }


}
