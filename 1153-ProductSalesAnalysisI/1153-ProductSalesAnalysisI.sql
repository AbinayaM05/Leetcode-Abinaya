-- Last updated: 8/11/2026, 9:55:39 PM
SELECT
    p.product_name,
    s.year,
    s.price
FROM Sales s
JOIN Product p
ON s.product_id = p.product_id;