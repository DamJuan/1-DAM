SELECT 
    CONCAT(SUBSTR(AUTOR, INSTR(AUTOR, ',') + 2),CONCAT( ' ', SUBSTR(AUTOR, 1, INSTR(AUTOR, ',') - 1))) AS nombre_completo
FROM LIBROS;
