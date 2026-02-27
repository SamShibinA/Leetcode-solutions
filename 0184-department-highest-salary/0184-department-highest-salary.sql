# Write your MySQL query statement below


select dept as Department,name as Employee,salary as Salary
from 
(select 
    e.name,
    e.salary,
    d.name as dept,
    Rank() over (Partition by e.departmentId order by e.salary desc) as rnk
from Employee e
left join department d 
on e.departmentId=d.id
)t
where rnk=1;