-- 코드를 입력하세요
select
DR_NAME,
DR_ID,
MCDP_CD,
date_format(HIRE_YMD,'%Y-%m-%d')
from DOCTOR
where MCDP_CD = 'GS' or MCDP_CD ='CS'
order by HIRE_YMD desc , DR_NAME