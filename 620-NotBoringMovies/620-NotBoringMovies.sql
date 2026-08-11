-- Last updated: 8/11/2026, 9:59:08 PM
SELECT *
FROM Cinema
WHERE id % 2 = 1
  AND description != 'boring'
ORDER BY rating DESC;
