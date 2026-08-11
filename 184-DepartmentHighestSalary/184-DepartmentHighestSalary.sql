-- Last updated: 8/11/2026, 10:05:28 PM
SELECT d.name AS Department,
       e.name AS Employee,
       e.salary AS Salary
FROM Employee e, Department d
WHERE e.departmentId = d.id
AND (departmentId, salary) IN (
    SELECT departmentId, MAX(salary)
    FROM Employee
    GROUP BY departmentId
);