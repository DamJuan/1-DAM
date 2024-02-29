REM   Script: 07
REM   5.1.-	Obtener el nombre de los oficios en los que el salario mínimo es mayor de 10000.

SELECT * 
FROM HR.EMPLOYEES 
WHERE SALARY > 10000 AND 
	NVL(COMMISSION_PCT,0) = 0;

