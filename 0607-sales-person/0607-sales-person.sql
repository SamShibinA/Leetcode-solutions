select s.name
from salesperson s
left join orders o
    on o.sales_id=s.sales_id
left join company c 
    on o.com_id=c.com_id
    and c.name='RED'
group by s.sales_id,s.name
having count(c.name)=0;