# Write your MySQL query statement below
(select u.name as results
from Users u
left join MovieRating mr
on u.user_id=mr.user_id
group by u.user_id,u.name
having count(*)=( 
    select max(cnt)
    from(
        select Count(*) as cnt
        from MovieRating 
        group by user_id
    )as t
    )
order by u.name
limit 1)
union all
(select m.title
from movies m
left join MovieRating mr
    on m.movie_id=mr.movie_id
where created_at >= '2020-02-01' and created_at < '2020-03-01'
group by mr.movie_id,m.title
order by avg(mr.rating) desc,m.title
limit 1);
