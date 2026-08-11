-- Last updated: 8/11/2026, 9:59:27 PM
SELECT id,
       COUNT(*) AS num
FROM
(
    SELECT requester_id AS id
    FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS id
    FROM RequestAccepted
) t
GROUP BY id
ORDER BY num DESC
LIMIT 1;
