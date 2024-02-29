REM   Script: 01
REM   5.1.-	Obtener el nombre de los oficios en los que el salario mínimo es mayor de 10000.

SELECT	JOB_TITLE 
FROM	HR.JOBS 
WHERE	MIN_SALARY > 10000;

