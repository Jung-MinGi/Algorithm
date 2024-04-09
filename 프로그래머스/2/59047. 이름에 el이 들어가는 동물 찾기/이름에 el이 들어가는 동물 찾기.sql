-- 코드를 입력하세요
select
ANIMAL_ID
,name
from ANIMAL_INS

where name like '%el%' and  ANIMAL_TYPE = 'Dog'
order by name