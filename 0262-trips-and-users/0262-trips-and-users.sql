# Write your MySQL query statement below

Select
    t.request_at as Day,
    round(sum(t.status in ('cancelled_by_driver','cancelled_by_client')) *1.0  /count(*),2) as `Cancellation Rate`
from trips t
join users c
    on c.users_id=t.client_id and c.banned='No'
join users d
    on d.users_id=t.driver_id and d.banned='No'
where t.request_at between '2013-10-01' and '2013-10-03'
group by t.request_at;
