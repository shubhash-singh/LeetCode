from functools import reduce


class Solution:
    def doesValidArrayExist(self, derived: list[int]) -> bool:
        return reduce(lambda x, y: x^y , derived, 0) == 0