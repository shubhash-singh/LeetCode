import heapq
from typing import Counter


class Solution:
    def isNStraightHand(self, hand: list[int], groupSize: int) -> bool:
        if len(hand) % groupSize != 0:
            return False
    
        # Step 2: Count the occurrences of each card
        card_count = Counter(hand)
        
        # Step 3: Form groups of consecutive cards
        min_heap = list(card_count.keys())
        heapq.heapify(min_heap)
        
        while min_heap:
            first_card = min_heap[0]
            for i in range(first_card, first_card + groupSize):
                if i not in card_count:
                    return False
                card_count[i] -= 1
                if card_count[i] == 0:
                    if i != min_heap[0]:
                        return False
                    heapq.heappop(min_heap)
        
        # Step 4: Return true if all groups are successfully formed
        return True