REM   Script: 05
REM   5.1.-	Obtener el nombre de los oficios en los que el salario mínimo es mayor de 10000.

SELECT JOB_TITLE, MIN_SALARY, MAX_SALARY, (MAX_SALARY - MIN_SALARY) AS "Variablidad" 
FROM HR.JOBS;
