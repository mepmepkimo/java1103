--計算總金額
select sum (d.PRICE * d.AMOUNT) as subtotal
from DRINK d
order by subtotal;

--建立動態小計
select d.ID,d."NAME",d.PRICE,d.AMOUNT,d.PRICE*d.AMOUNT as subtotal
from DRINK d;

--利用where限制式
select d.ID,d."NAME",d.PRICE,d.AMOUNT
from DRINK d
where d.AMOUNT>= 10 and d.PRICE>=50;

