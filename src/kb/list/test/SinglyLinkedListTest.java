package kb.list.test;

import kb.list.SinglyLinkedList;

public class SinglyLinkedListTest<K> {
   public static void main(String[] args) {
       SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
       linkedList.addFirst(10);
       linkedList.addFirst(20);
       linkedList.addFirst(30);
       
       linkedList.addLast(0);
       linkedList.addLast(-10);
       System.out.println(linkedList);
       
       linkedList.addAtPosition(22,1);
       linkedList.addAtPosition(11,3);
       linkedList.addAtPosition(5,5);
       linkedList.addAtPosition(-5,7);
       linkedList.addAtPosition(-20,9);
       linkedList.addAtPosition(-200,11);
       
       System.out.println(linkedList);
   }
}
