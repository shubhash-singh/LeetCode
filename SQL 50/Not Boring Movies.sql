-- https://leetcode.com/problems/not-boring-movies/

SELECT c.id, c.movie, c.description, c.rating FROM Cinema c
WHERE
(c.id % 2 != 0) AND (c.description != 'boring')
ORDER BY rating DESC;


-- Input: 
-- Cinema table:
-- +----+------------+-------------+--------+
-- | id | movie      | description | rating |
-- +----+------------+-------------+--------+
-- | 1  | War        | great 3D    | 8.9    |
-- | 2  | Science    | fiction     | 8.5    |
-- | 3  | irish      | boring      | 6.2    |
-- | 4  | Ice song   | Fantacy     | 8.6    |
-- | 5  | House card | Interesting | 9.1    |
-- +----+------------+-------------+--------+
-- Output: 
-- +----+------------+-------------+--------+
-- | id | movie      | description | rating |
-- +----+------------+-------------+--------+
-- | 5  | House card | Interesting | 9.1    |
-- | 1  | War        | great 3D    | 8.9    |
-- +----+------------+-------------+--------+
-- Explanation: 
-- We have three movies with odd-numbered IDs: 1, 3, and 5. The movie with ID = 3 is boring so we do not include it in the answer.