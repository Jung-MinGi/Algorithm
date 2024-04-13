-- 코드를 입력하세요
select
hour(datetime) as hour
,count(*) as count
from ANIMAL_OUTS 
where hour(datetime) between 9 and 19
group by hour(datetime)
order by hour