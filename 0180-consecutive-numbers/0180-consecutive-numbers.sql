# Write your MySQL query statement below
select distinct num as ConsecutiveNums
from(
    select num,
    Lag(num) over(order by id) as pre,
    Lead(num) over(order by id) as next
    from Logs
 ) t
where num=pre and num=next;