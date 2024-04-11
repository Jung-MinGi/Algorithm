-- 코드를 입력하세요
select
substring(PRODUCT_CODE,1,2),count(PRODUCT_ID)
from PRODUCT 
group by substring(PRODUCT_CODE,1,2)