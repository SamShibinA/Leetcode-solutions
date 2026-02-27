# Write your MySQL query statement below
select 
score,
DENSE_RANK() over (Order by Score desc) as `rank`
from
scores;