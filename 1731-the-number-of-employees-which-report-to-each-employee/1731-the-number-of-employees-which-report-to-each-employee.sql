# Write your MySQL query statement below
select
e.employee_id,
e.name,
Count(m.employee_id) as reports_count,
round(avg(m.age)) as average_age
from employees e
join employees m
on m.reports_to=e.employee_id
group by e.employee_id,e.name
order by e.employee_id;