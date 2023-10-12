-- 코드를 입력하세요
SELECT ANIMAL_ID,NAME,
case  
    when SEX_UPON_INTAKE='Neutered Male' then 'O'
    when SEX_UPON_INTAKE='Spayed Female' then 'O'
    else 'X'
    end as '중성화'
    from ANIMAL_INS  order by ANIMAL_ID;