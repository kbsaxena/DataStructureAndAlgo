package kb.list;

public class SinglyLinkedList<K> {
    Node<K> head;
    
    public SinglyLinkedList(){
        head = null;
    }
    
    public Node<K> getHead(){
        return head;
    }
    
}

class Node<K>{
    K value;
    Node<K> next;
    
    Node(K value){
        this.value = value;
        this.next = null;
    }
}
