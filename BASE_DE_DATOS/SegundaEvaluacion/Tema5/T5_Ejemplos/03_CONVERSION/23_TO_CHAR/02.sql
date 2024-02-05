--TO_CHAR(dato[, 'formato'])
--Caracteres de formato de FECHA
SELECT  FECHA, TO_CHAR(FECHA, 'YYYY'), TO_CHAR(FECHA, 'DDD'), TO_CHAR(FECHA, 'Q')
FROM    FACTURA;