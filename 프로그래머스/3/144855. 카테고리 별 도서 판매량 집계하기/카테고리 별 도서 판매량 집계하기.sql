select
CATEGORY,sum(s.SALES) as TOTAL_SALES
from book b join BOOK_SALES s
on b.BOOK_ID = s.BOOK_ID
where s.SALES_DATE like '2022-01%'
group by CATEGORY
order by CATEGORY