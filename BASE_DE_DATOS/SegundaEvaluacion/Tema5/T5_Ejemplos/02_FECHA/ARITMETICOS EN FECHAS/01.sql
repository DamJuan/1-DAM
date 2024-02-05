--fecha+n, fecha-n 
SELECT  sysdate+1, sysdate-1
FROM    DUAL;

--fecha1-fecha2
SELECT  sysdate-to_date('19/02/22')
FROM    DUAL;

--fecha1+n/24
ALTER SESSION SET NLS_DATE_FORMAT='dd/mm/yy hh24:mi';

SELECT  sysdate+1/24,sysdate-1/24 
FROM    DUAL;
