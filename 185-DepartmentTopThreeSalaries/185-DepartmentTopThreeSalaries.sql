-- Last updated: 8/11/2026, 10:05:20 PM
SELECT d.name Department,
       e.name Employee,
       e.salary Salary
FROM Employee e
JOIN Department d
ON e.departmentId = d.id
WHERE (
    SELECT COUNT(DISTINCT salary)
    FROM Employee
    WHERE departmentId = e.departmentId
      AND salary > e.salary
) < 3;