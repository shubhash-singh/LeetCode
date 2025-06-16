

public class MyLinkedList {
    
    Node Head;
    private int size;

    private class Node {
        Node next;
        int val;

        Node(int val){
            this.val = val;
        }
        
    }
    

    public MyLinkedList() {
        Head = null;
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node current = Head;
        while(index > 0 && current != null){
            current = current.next;
            index--;
        }
        return current.val;
    }
    
    public void addAtHead(int val) {
        if(Head == null){
            Head = new Node(val);
        }
        else{
            Node newNode = new Node(val);
            newNode.next = Head;
            Head = newNode;
            
        }
        size++;
    }
    
    public void addAtTail(int val) {
        if (Head == null) {
            Head = new Node(val);
        }
        else{
            Node current = Head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node(val);
            current.next = newNode;
            
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
    
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
    
        Node current = Head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
    
        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }
    
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            Head = Head.next;
        } else {
            Node current = Head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */