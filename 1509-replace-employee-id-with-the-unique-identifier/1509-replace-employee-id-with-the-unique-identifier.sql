SELECT E2.unique_id,E1.name 
from Employees E1
LEFT JOIN EmployeeUNI E2 on E1.id=E2.id ;