REM   Script: 02
REM   5.1.-	Obtener el nombre de los oficios en los que el salario mínimo es mayor de 10000.

SELECT	HIRE_DATE, LAST_NAME || ',' || FIRST_NAME AS "NOMBRE COMPLETO" 
FROM	HR.EMPLOYEES 
WHERE	TO_CHAR(HIRE_DATE,'YYYY') BETWEEN '2002' AND '2005';

