--FORMATO YY
SELECT TO_CHAR(TO_DATE('27/02/23', 'DD/MM/YY'), 'YYYY'), TO_CHAR(TO_DATE('27/02/99', 'DD/MM/YY'), 'YYYY') 
FROM DUAL;

--FORMATO RR
SELECT TO_CHAR(TO_DATE('27/02/23', 'DD/MM/RR'), 'YYYY'), TO_CHAR(TO_DATE('27/02/99', 'DD/MM/RR'), 'YYYY') 
FROM DUAL;

--FORMATO YYYY
SELECT TO_CHAR(TO_DATE('27/02/23', 'DD/MM/YYYY'), 'YYYY'), TO_CHAR(TO_DATE('27/02/99', 'DD/MM/YYYY'), 'YYYY') 
FROM DUAL;

--FORMATO RRRR
SELECT TO_CHAR(TO_DATE('27/02/23', 'DD/MM/RRRR'), 'YYYY'), TO_CHAR(TO_DATE('27/02/99', 'DD/MM/RRRR'), 'YYYY') 
FROM DUAL;

