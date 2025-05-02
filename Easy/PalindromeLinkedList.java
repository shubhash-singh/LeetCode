package Easy;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;

        while(current != null){
            list.add(current.val);
            current = current.next;
        }
        int start = 0;
        int end = list.size() - 1;
        while(start < end){
            if(list.get(start) != list.get(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
}