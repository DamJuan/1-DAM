SELECT	NOMPUERTO
FROM	PUERTO
WHERE	ALTURA > (SELECT ROUND(AVG(ALTURA),2) 
		FROM PUERTO
		WHERE	CATEGORIA = '2')