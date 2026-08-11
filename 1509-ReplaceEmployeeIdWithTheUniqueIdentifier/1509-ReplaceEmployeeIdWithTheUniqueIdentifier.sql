-- Last updated: 8/11/2026, 9:54:20 PM
SELECT euni.unique_id, e.name 
FROM Employees e  
LEFT JOIN EmployeeUNI euni  
ON e.id = euni.id;
