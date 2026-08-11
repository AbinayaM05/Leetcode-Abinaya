-- Last updated: 8/11/2026, 9:59:37 PM
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;
