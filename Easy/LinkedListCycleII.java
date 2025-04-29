package Easy;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode currentFast = head;
        ListNode currentSlow = head;

        while (currentFast != null && currentFast.next != null) {
            currentFast = currentFast.next.next;
            currentSlow = currentSlow.next;
            
            if (currentFast == currentSlow) {
                currentSlow = head;
                while (currentSlow != currentFast) {
                    currentSlow = currentSlow.next;
                    currentFast = currentFast.next;
                }
                return currentSlow;
            }
        }
        return null;
    }
}
