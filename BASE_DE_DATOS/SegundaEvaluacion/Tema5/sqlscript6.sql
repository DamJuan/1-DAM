REM   Script: 06
REM   5.1.-	Obtener el nombre de los oficios en los que el salario mínimo es mayor de 10000.

SELECT * 
FROM HR.JOBS 
WHERE (MAX_SALARY - MIN_SALARY) > 10000;

