SELECT CODVEN,COUNT(CODFAC)
FROM FACTURA
WHERE TO_CHAR(FECHA,'YYYY') = '2002'
GROUP BY CODVEN
HAVING COUNT(CODFAC) > 3;