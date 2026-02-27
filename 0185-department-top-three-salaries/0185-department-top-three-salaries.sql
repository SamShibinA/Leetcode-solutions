# Write your MySQL query statement below

select
    dept as Department,
    name as Employee,
    salary as Salary
from
    (select
        e.name,
        e.salary,
        e.departmentId,
        d.name as dept,
        dense_rank() over(partition by e.departmentId order by e.salary desc) as rnk
    from employee e
    left join department d
    on e.departmentId=d.id
    )t
where rnk<=3;