-- 코드를 입력하세요
select
FACTORY_ID
,FACTORY_NAME
,address
from FOOD_FACTORY 
where address like '강원%'
order by FACTORY_ID