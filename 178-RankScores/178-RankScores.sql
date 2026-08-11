-- Last updated: 8/11/2026, 10:05:44 PM
SELECT score,
       DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores;