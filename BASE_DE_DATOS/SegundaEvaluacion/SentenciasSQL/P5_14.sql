SELECT 	CODART AS "C�digo Original", REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(codigo, 'a', ''), 'e', ''), 'i', ''), 'o', ''), 'u', '') AS "C�digo Sin Vocales"
FROM 	ARTICULO
WHERE 	(CODART LIKE '%a%' OR CODART LIKE '%A%') AND
	CODART LIKE '%[0-9]'
