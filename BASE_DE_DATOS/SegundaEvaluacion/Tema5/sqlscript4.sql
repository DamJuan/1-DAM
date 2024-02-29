REM   Script: 04
REM   5.1.-	Obtener el nombre de los oficios en los que el salario mínimo es mayor de 10000.

SELECT * 
FROM HR.EMPLOYEES 
WHERE (DEPARTMENT_ID = 50 OR DEPARTMENT_ID = 80) AND TO_NUMBER(TO_CHAR(HIRE_DATE, 'MM')) = 01;

