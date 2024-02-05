--TO_DATE(cad[, 'formato'])
--DEVUELVE UNA FECHA!!
--La cadena tiene que poder ser transformada a fecha según formato

SELECT  TO_DATE('370101', 'YY-MM-DD')
FROM    DUAL;