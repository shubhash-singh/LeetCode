-- https://leetcode.com/problems/biggest-single-number/

SELECT MAX(num) AS num
FROM (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS subquery;


-- Input: 
-- MyNumbers table:
-- +-----+
-- | num |
-- +-----+
-- | 8   |
-- | 8   |
-- | 7   |
-- | 7   |
-- | 3   |
-- | 3   |
-- | 3   |
-- +-----+
-- Output: 
-- +------+
-- | num  |
-- +------+
-- | null |
-- +------+
-- Explanation: There are no single numbers in the input table so we return null.
