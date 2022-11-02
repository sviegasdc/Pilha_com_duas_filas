public class TestPilha_com_filas {
    public static void main(String[] args) {
        PilhaFila PilhaF = new PilhaFila(6);
//inserir elementos na pilha 1
        PilhaF.EnqueueFila1("fila1-1");
        PilhaF.EnqueueFila1("fila1-2");
        PilhaF.EnqueueFila1("fila1-3");

        PilhaF.EnqueueFila2("fila2-1");
        PilhaF.EnqueueFila2("fila2-2");
        PilhaF.EnqueueFila2("fila2-3");

        PilhaF.EnqueueFila1("fila2-4");
        PilhaF.EnqueueFila1("fila1-5");
        PilhaF.EnqueueFila1("fila2-6");

// System.out.println(PilhaF);
//// inserir elementos na pilha 2
//        PilhaF.EnqueueFila2("fila2-1");
//        PilhaF.EnqueueFila2("fila2-2");
//        PilhaF.EnqueueFila2("fila2-3");

        System.out.println(PilhaF);
// deletar elementos da pilha 1
// PilhaF.DequeueFila1();
// PilhaF.DequeueFila1();
//        PilhaF.DequeueFila1();
// PilhaF.popPilha1();
// causando a exceção de pilha vazia
// PilhaF.popPilha1();
//        PilhaF.EnqueueFila1("fila2-4");
//        PilhaF.EnqueueFila1("fila1-5");
//        PilhaF.EnqueueFila1("fila2-6");
// deletar elementos da pilha 2
// PilhaF.DequeueFila2();
// PilhaF.DequeueFila2();
// PilhaF.DequeueFila2();
// causando a exceção de pilha vazia
//        PilhaF.DequeueFila2();

//        PilhaF.EnqueueFila2("fila2-4");
//        PilhaF.EnqueueFila2("fila2-5");
//        PilhaF.EnqueueFila2("fila2-6");
//        PilhaF.EnqueueFila2("fila2-7");
//        PilhaF.EnqueueFila2("fila2-8");
//        System.out.println(PilhaF);
//        PilhaF.EnqueueFila2("fila2-9");

// mostrar o array com elementos
//        System.out.println(PilhaF);
    }
}