-- Last updated: 8/11/2026, 9:59:04 PM
UPDATE Salary
SET sex = CASE
    WHEN sex = 'm' THEN 'f'
    ELSE 'm'
END;
