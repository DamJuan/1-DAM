SELECT	CODART, PRECIO, DECODE(SIGN (NVL(PRECIO,0)-30), 1, 10, 15) AS "DESCUENTO"
FROM 	ARTICULO
WHERE	PRECIO*STOCK > 150;