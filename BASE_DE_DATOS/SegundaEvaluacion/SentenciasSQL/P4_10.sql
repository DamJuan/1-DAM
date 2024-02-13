SELECT 	SUBSTR(AUTOR, 1, INSTR(AUTOR, ',') - 1) AS apellido,
	SUBSTR(AUTOR, INSTR(AUTOR, ',') + 2) AS nombre_de_pila,
	AUTOR AS nombre_completo
FROM LIBROS;
