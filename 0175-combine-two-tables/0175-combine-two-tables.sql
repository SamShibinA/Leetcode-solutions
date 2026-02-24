select person.firstName,person.lastName,address.state,address.city
from person
left join address
on person.personID=address.personID