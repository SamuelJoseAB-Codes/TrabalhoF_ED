package src.jogo;

public class Node<T> {
    
    // atributos da classe;

    private T data;
    private Node<T> next;
    private Node<T> previous;

    // construtor;

    public Node (T data) {
        this.data = data;
    }

    // get;

    public T getData () {
        return this.data;
    }

    public Node<T> getNext () {
        return this.next;
    }

    public Node<T> getPrevious () {
        return this.previous;
    }

    // set;

    public void setNext (Node<T> next) {
        this.next = next;
    }

    public void setPrevious (Node<T> previous) {
        this.previous = previous;
    }
}
