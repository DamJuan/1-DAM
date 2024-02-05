--INSTR (cad1, cad2, [pos_inicio[, ocurrencia]])
--pos_inicio>0

SELECT  INSTR ('BASES DE DATOS', 'A'), INSTR ('BASES DE DATOS', 'A', 2), INSTR ('BASES DE DATOS', 'A', 1, 2)
FROM    DUAL;