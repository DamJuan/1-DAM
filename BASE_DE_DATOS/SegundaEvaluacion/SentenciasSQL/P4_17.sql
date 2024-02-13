SELECT TO_CHAR(FECHA_ALT, '"') || APELLIDO || ' (' || EMP_NO || ') se incorporó el trimestre ' || TO_CHAR(FECHA_ALT, 'q') || ' de ' || TO_CHAR(FECHA_ALT, 'YYYY') AS LEYENDA 
FROM EMPLE 
WHERE DEPT_NO = 10;
