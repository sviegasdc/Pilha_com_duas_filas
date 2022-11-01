public interface IPilhaFila {
    public void EnqueueFila1(Object elemento);
    public void EnqueueFila2(Object elemento);
    // ‘Dequeue’ das filas (LIFO)
    public Object DequeueFila1() throws emptyQueueException;
    public Object DequeueFila2() throws emptyQueueException;
}
