SELECT DORSAL, NOMBRE
FROM CICLISTA
WHERE DORSAL NOT IN (SELECT DISTINCT DORSAL
			FROM LLEVAR)