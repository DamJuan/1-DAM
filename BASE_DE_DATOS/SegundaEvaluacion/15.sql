SELECT  CODFAC, FECHA, NEXT_DAY(FECHA, 'VIERNES') CONTABILIZACION
FROM    FACTURA
WHERE   TO_CHAR (FECHA,'yyyy')='2002'