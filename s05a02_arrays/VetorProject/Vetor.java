/**
 * Classe Vetor implementa um vetor que aumenta de tamanho
 */
public class Vetor {
    /**
     * Atributos da classe
     */
    private int size; // contém o número de elementos atualmento no Vetor;
    private Integer[] array; // o dito cujo array
    private int capacidade; // tamanho total do array

    /**
     * Construtor recebe como parâmetro o tamanho inicial do vetor. 
     * @param n o tamanho inicial do vetor.
     */
    public Vetor(int n) {
        if(n <= 0) n = 10;
        size = 0;
        capacidade = n;
        array = new Integer[n];
    }

    public void add(Integer i) {
        if(size == capacidade) {
            capacidade = capacidade * 2;
            Integer[] aux = new Integer[capacidade];
            for(int j = 0; j < size; j++) {
                aux[j] = array[j];
            }
            array = aux;
        }
        array[size] = i;
        size++;
    }

    /**
     * Recebe como parâmetro uma posição do vetor e retorna o Integer que
     * estiver naquela posição; se a posição não estiver ocupada ou 
     * ultrapassar o tamanho do vetor, este método retorna nulo.
     * @param i o índice
     */
    public Integer get(int i) {
        if(i >= 0 && i < size) {
            return array[i];
        }
        else {
            return null;
        }
    }

    /**
     * A função size retorna o número de elementos atualmente no vetor.
     * @return um int representando o número de elementos atualmente no vetor
     */
    public int size() {
        return size;
    }

    public int capacidade() {
        return capacidade;
    }

    public String toString() {
        String resultado = "Vetor[ ";
        for(int i = 0; i < size; i++) {
            resultado = resultado + array[i] + " ";
        }
        resultado += "]";
        return resultado;
    }

    /**
     * retorna true se este vetor é igual ao vetor v passado como
     * parâmetro; retorna false caso contrário.
     * @return true se forem iguais; false caso contrário.
     */
    public boolean equals(Vetor v) {
        if(v == null || (this.size != v.size)) {
            return false;
        }
        for(int i = 0; i < this.size; i++) {
            if( ! this.array[i].equals(v.array[i]) ) {
                return false;
            }
        }
        return true;
    }
}
