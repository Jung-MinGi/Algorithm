-- 코드를 입력하세요
select
ANIMAL_ID
,name
,case 
when SEX_UPON_INTAKE like 'Neu%'
then 'O'
when SEX_UPON_INTAKE like 'Spa%'
then 'O'
else 'X'
end
from ANIMAL_INS
