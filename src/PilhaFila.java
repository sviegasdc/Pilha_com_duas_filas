import java.sql.SQLOutput;
import java.util.Arrays;

public class PilhaFila implements IPilhaFila {
    public int end1;
    public int end2;
    public int start2;
    // só precisa de um start (start para a fila 2) pois a primeira fila sempre começa no índice 0 do array (primeiro elemento)
    // criando o array
    public Object PilhaF[];

    public PilhaFila(int sizeArray) {
        this.PilhaF = new Object[sizeArray];
        this.end1 = -1; // end1 começa no começo do array e dps vai andar para frente conforme as inserções
        this.end2 = sizeArray - 3;
        // definindo um 'end' para a fila2
        // a fila2 precisa de algum lugar para começar, se ela começar no final do array(como visto nas pilhas) toda vez que
        // um elemento for inserido (end2++) vai ser preciso fazer a duplicação do array
        this.start2 = sizeArray - 2;
    }

    public void EnqueueFila1(Object elemento) {
        if (end1 + 1 == start2) {
            System.out.println("Fila 1 chegou ao topo, hora de duplicar");
            duplicaArrayFila1();
        } else {
            end1++; // indo para próxima posição para depois inserir
            this.PilhaF[end1] = elemento; // agora inserindo
        }
    }

    public void EnqueueFila2(Object elemento) {
        if (end2 == this.PilhaF.length - 1) {
            System.out.println("Fila 2 chegou ao topo, hora de duplicar");
            duplicaArrayFila2();
        }
        this.end2 = this.end2 + 1;
        this.PilhaF[end2] = elemento;
    }

    public Object DequeueFila1() throws emptyQueueException {
        if (end1 < 0) { // if isEmpty
            throw new emptyQueueException("Não foi possível remover nenhum elemento pois a Fila 1 está vazia");
        }
// e como é uma "fila pilha" vai remover o primeiro elemento e não o último
        this.PilhaF[end1] = null; // substitui o elemento removido por 'null' só para ficar fácil a visualização
        this.end1 = end1 - 1; // colocando o 'end' no elemento anterior ao removido
        return PilhaF;
    }

    public Object DequeueFila2() throws emptyQueueException {
        if (end2 != start2) { // if isEmpty
            this.PilhaF[end2] = null; // substitui o elemento removido por 'null' só para ficar fácil a visualização
            this.end2--; // colocando o 'end' no elemento anterior ao removido
            return PilhaF;
        } else {
            throw new emptyQueueException("Não foi possível remover nenhum elemento pois a Fila 2 está vazia");
        }
    }

    // duplicando o array quando as filas estiverem cheias
    // QUEBRADO
    private void duplicaArrayFila2() {
        int novoSize = this.PilhaF.length * 2;
        Object novoArray[] = new Object[novoSize];
        // copiar elementos da fila 1
        if (end2 == this.PilhaF.length - 1) {
            // esse só funciona para quando a fila 2 chegar ao topo
            for (int i = 0; i <= this.end1; i++) {
                novoArray[i] = this.PilhaF[i];
            }
            // copiar elementos da fila 2
            for (int i = this.start2; i <= this.end2; i++) {
                novoArray[i] = this.PilhaF[i];
            }
            this.PilhaF = novoArray;
        }
    }

    private void duplicaArrayFila1() {
        int novoSize = this.PilhaF.length * 2;
        Object novoArray[] = new Object[novoSize];
            // quando a fila 1 chegar ao topo (aumentar o espaço entre as filas ao invés de aumentar o espaço depois da fila2)
            // pegar os elementos da fila1 e adicionar no novo array
            for(int i=0; i<=this.end1; i++){
                novoArray[i] = this.PilhaF[i];
            }
            novoSize--;
            // pegando os elementos da fila2 e colocando eles no final do novo array
            for(int i=this.end2; i>=this.end1 + 1; i--){
                novoArray[novoSize--] = this.PilhaF[i];
                System.out.println(Arrays.toString(PilhaF));
            }
            this.PilhaF = novoArray;
            this.end2 =  this.PilhaF.length - 1;
        }

        // escrever o array com os elementos das pilhas
        @Override
        public String toString () {
            String saida = "[ ";
            for (Object elemento : this.PilhaF) {
                saida += String.format("%s, ", elemento);
            }
            saida += "]";
            return saida;
        }
    }
