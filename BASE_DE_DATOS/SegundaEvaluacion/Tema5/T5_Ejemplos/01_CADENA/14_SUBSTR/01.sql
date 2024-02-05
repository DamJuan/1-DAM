--SUBSTR (cad, pos_inicio, [longitud])
--pos_inicio<0

SELECT  SUBSTR ('BASES DE DATOS', -5, 5), SUBSTR('BASES DE DATOS',-1), SUBSTR('BASES DE DATOS', -5,2)
FROM    DUAL;