SELECT FECHA, CONCEPTO, ROUND(CANT * PRECIOUD,1) AS "TOTAL"
FROM GASTOS
WHERE FECHA BETWEEN '01-02-2023' AND '28-02-2023';