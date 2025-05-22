public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l1Head = list1;
        ListNode startNode = list1;
        ListNode endNode = list1;

        for(int i = 0; i < a-1; i++){
            startNode = startNode.next;
        }
        for(int i=0;i<=b;i++){
            endNode = endNode.next;
        }

        startNode.next = list2;

        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = endNode;
        return l1Head;
    }

}
