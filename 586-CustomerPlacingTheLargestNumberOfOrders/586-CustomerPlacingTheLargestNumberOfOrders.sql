-- Last updated: 8/11/2026, 9:59:41 PM
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(*) DESC
LIMIT 1;
