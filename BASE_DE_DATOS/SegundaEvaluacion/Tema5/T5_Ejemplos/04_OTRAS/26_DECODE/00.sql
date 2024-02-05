--DECODE (ref_columna, valor1, cod1, valor2, cod2, ..., vdefecto)

SELECT  DECODE (TO_CHAR(FECHA, 'Q'), '1', 'PRIMERO', '2', 'SEGUNDO', 'OTRO')
FROM    FACTURA;