--INSTR (cad1, cad2, [pos_inicio[, ocurrencia]])
--pos_inicio<1

SELECT  INSTR ('BASES DE DATOS', 'A',-1), INSTR ('BASES DE DATOS', 'A',-5), INSTR ('BASES DE DATOS', 'A',-1, 2)
FROM    DUAL;