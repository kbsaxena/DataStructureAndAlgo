package kb.list.test;

import kb.list.SinglyLinkedList;

public class SinglyLinkedListTest<K> {
   public static void main(String[] args) {
       SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
       linkedList.addFirst(1);
       linkedList.addFirst(2);
       linkedList.addFirst(3);
       
       linkedList.addLast(0);
       linkedList.addLast(-1);
       System.out.println(linkedList);
   }
}
