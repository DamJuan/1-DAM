--TO_NUMBER(cad[, 'formato'])
--DEVUELVE UN NUMERO!!
--La cadena tiene que poder ser transformada a numero

SELECT  ROUND(TO_NUMBER('25,89')), TO_NUMBER(TO_CHAR(SYSDATE, 'mm'))
FROM    DUAL;