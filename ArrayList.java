package src.jogo;

public class ArrayList<T> {
    
    // atributos da classe;

    private Node<T> head;
    private Node<T> tail;
    private int size;

    // get

    public int getSize () {
        return this.size;
    }

    // metodos

    // add () adiciona um elemento a lista;

    public void add (T data) {
        Node<T> node = new Node<T> (data);
        this.size++;

        if (this.head == null && this.tail == null) {
            this.head = node;
            this.tail = node;
            return;
        }

        this.tail.setNext(node);
        this.tail.getNext().setPrevious(this.tail);
        this.tail = node;
    }

    // get () retorna um elemento da lista, de acordo com a posição que for passada;

    public T get (int position) {
        Node<T> assistant = this.head;

        for (int cont = 0; cont < position; cont++) {
            assistant = assistant.getNext();
        }

        return assistant.getData();
    }

}
