--SUBSTR (cad, pos_inicio, [longitud])
--pos_inicio>0

SELECT  SUBSTR ('BASES DE DATOS', 1, 5), SUBSTR('BASES DE DATOS',10), SUBSTR('BASES DE DATOS', 7, 2)
FROM    DUAL;