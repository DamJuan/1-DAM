REM   Script: 03
REM   5.1.-	Obtener el nombre de los oficios en los que el salario mínimo es mayor de 10000.


SELECT	FIRST_NAME, LAST_NAME,JOB_ID 
FROM	HR.EMPLOYEES 
WHERE	UPPER(JOB_ID) LIKE '%CLERK%';

