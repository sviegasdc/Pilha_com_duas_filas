public class TestPilha_com_filas {
    public static void main(String[] args) {
        PilhaFila PilhaF = new PilhaFila(6);
//inserir elementos na pilha 1
        PilhaF.EnqueueFila1("fila1-1");
        PilhaF.EnqueueFila1("fila1-2");
        PilhaF.EnqueueFila1("fila1-3");
//        PilhaF.EnqueueFila1("fila1-4");
//        PilhaF.EnqueueFila1("fila1-5");
//        PilhaF.EnqueueFila1("fila1-6");

        PilhaF.EnqueueFila2("fila2-1");
        System.out.println(PilhaF);
        PilhaF.EnqueueFila2("fila2-2");
        System.out.println(PilhaF);
        PilhaF.EnqueueFila2("fila2-3");
        System.out.println(PilhaF);

//        System.out.println(PilhaF);
//        PilhaF.EnqueueFila2("fila2-5");
//        System.out.println(PilhaF);
//        PilhaF.EnqueueFila2("fila2-6");
//        PilhaF.EnqueueFila2("fila2-7");
//        PilhaF.EnqueueFila2("fila2-8");
//        PilhaF.EnqueueFila2("fila2-9");


// System.out.println(PilhaF);
//// inserir elementos na pilha 2
//        PilhaF.EnqueueFila2("fila2-1");
//        PilhaF.EnqueueFila2("fila2-2");
//        PilhaF.EnqueueFila2("fila2-3");

//        System.out.println(PilhaF);
        PilhaF.EnqueueFila1("fila1-4");
        PilhaF.EnqueueFila1("fila1-5");
        System.out.println(PilhaF);

//        PilhaF.EnqueueFila1("fila1-6");
// mostrar o array com elementos
                PilhaF.EnqueueFila2("fila2-4");
        System.out.println(PilhaF);
    }
}