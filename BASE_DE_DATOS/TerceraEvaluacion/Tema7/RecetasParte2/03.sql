SELECT  NOMUSU || '/' ||PWD "CREDENCIALES", SUBSTR(EMAIL, INSTR(EMAIL, '@')+1, (INSTR(EMAIL, '.')-INSTR(EMAIL, '@'))-1)  " SERVIDOR DE DATOS"
FROM    USUARIO;