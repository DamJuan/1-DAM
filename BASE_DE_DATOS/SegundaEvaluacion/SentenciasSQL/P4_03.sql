SELECT FECHA, CONCEPTO, CANT
FROM GASTOS
WHERE MOD(CANT,2) = 0;
