SELECT 	CODART AS "Código Original", REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(codigo, 'a', ''), 'e', ''), 'i', ''), 'o', ''), 'u', '') AS "Código Sin Vocales"
FROM 	ARTICULO
WHERE 	(CODART LIKE '%a%' OR CODART LIKE '%A%') AND
	CODART LIKE '%[0-9]'
