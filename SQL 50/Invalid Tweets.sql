-- https://leetcode.com/problems/invalid-tweets/description/
SELECT
tweet_id 
FROM 
Tweets 
WHERE LENGTH(content) > 15;


-- Input: 
-- Tweets table:
-- +----------+-----------------------------------+
-- | tweet_id | content                           |
-- +----------+-----------------------------------+
-- | 1        | Let us Code                       |
-- | 2        | More than fifteen chars are here! |
-- +----------+-----------------------------------+
-- Output: 
-- +----------+
-- | tweet_id |
-- +----------+
-- | 2        |
-- +----------+
-- Explanation: 
-- Tweet 1 has length = 11. It is a valid tweet.
-- Tweet 2 has length = 33. It is an invalid tweet.