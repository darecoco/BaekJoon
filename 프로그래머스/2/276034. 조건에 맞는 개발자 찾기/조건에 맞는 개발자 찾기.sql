# SELECT d.id, d.email, d.first_name, d.last_name FROM DEVELOPERS d
# JOIN SKILLCODES s ON d.skill_code & s.code = s.code
# WHERE s.name in ('Python', 'C#')
# ORDER BY d.id;

select distinct id, email, first_name, last_name
from developers
join skillcodes on skillcodes.code & developers.skill_code=skillcodes.code
where skillcodes.name in ('C#','Python')
order by id;