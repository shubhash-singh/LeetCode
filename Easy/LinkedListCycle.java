package Easy;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode currentFast = head;
        ListNode currentSlow = head;

        if (head.next == null){
            return false;
        }

        while (currentFast != null && currentFast.next != null) {
            currentFast = currentFast.next.next;
            currentSlow = currentSlow.next;
            
            if (currentFast == currentSlow) {
                return true;
            }
        }
        return false;

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
