-- Last updated: 8/11/2026, 9:59:39 PM
SELECT name, population, area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;