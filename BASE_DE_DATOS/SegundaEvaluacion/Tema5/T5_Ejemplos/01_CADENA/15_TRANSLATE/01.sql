--TRANSLATE (cad1, cad2, cad3)
--Se puede usar para eliminar caracteres determinados de una cadena

SELECT  TRANSLATE ('BASES DE DATOS', 'ZAEIOU', 'Z')
FROM    DUAL;