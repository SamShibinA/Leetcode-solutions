select w1.id as Id
from Weather w1
join Weather w2
on date_sub(w1.recordDate,interval 1 day)=w2.recordDate
where w1.temperature>w2.temperature;
