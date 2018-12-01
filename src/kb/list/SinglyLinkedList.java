package kb.list;

public class SinglyLinkedList<K> {
    Node<K> head;
    
    public SinglyLinkedList(){
        head = null;
    }
    
    public Node<K> getHead(){
        return head;
    }
    
    public void addFirst(K value) {
        Node<K> firstElement = new Node<>(value);
        
        if(size() == 0) {
            head = firstElement;
        }
        else {
            Node<K> temp = head;
            firstElement.next = temp;
            head = firstElement;
        }
    }
    
    public int size() {
        Node<K> headNode = head;
        int result = 0;
        while(headNode != null) {
            result++;
            headNode = headNode.next;
        }
        return result;
    }

    @Override
    public String toString() {
        return head + "";
    }
    
    
}

class Node<K>{
    K value;
    Node<K> next;
    
    Node(K value){
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return  "|"+value + "|" +"->" + next;
    }
    
}
