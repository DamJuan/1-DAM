--INSTR (cad1, cad2, [pos_inicio[, ocurrencia]])
--pos_inicio>0

SELECT  INSTR ('LAS BASES DE DATOS SON CHULAS', 'AS'),INSTR ('LAS BASES DE DATOS SON CHULAS', 'AS', 1, 2)
FROM    DUAL;