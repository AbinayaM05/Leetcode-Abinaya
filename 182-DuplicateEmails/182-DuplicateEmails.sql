-- Last updated: 8/11/2026, 10:05:36 PM
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;