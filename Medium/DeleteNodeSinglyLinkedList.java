public class DeleteNodeSinglyLinkedList{
    public static void main(String[] args) {
        
    }
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return;
        }

       
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) { 
        val = x; 
    }
}
