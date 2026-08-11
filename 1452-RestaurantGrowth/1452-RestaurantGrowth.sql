-- Last updated: 8/11/2026, 9:54:36 PM
SELECT
    visited_on,
    SUM(amount) OVER(ORDER BY visited_on ROWS 6 PRECEDING) amount,
    ROUND(AVG(amount) OVER(ORDER BY visited_on ROWS 6 PRECEDING),2) average_amount
FROM(
    SELECT visited_on,SUM(amount) amount
    FROM Customer
    GROUP BY visited_on
)t
LIMIT 1000000 OFFSET 6;
