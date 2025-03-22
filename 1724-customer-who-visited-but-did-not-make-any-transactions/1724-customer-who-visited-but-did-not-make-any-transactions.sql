SELECT v.customer_id,COUNT(v.visit_id) as count_no_trans
FROM Visits v
LEFT JOIN Transactions t
on v.visit_id=t.visit_id
where t.transaction_id is null
group by v.customer_id;
