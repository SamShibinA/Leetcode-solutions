# Write your MySQL query statement below

select round(sum(tiv_2016),2) as tiv_2016
from(
    select 
        tiv_2016,
        count(*) over(partition by tiv_2015) as tcnt,
        count(*) over(partition by lat,lon) as lcnt
    from insurance
) t
where lcnt=1 and tcnt>1;
