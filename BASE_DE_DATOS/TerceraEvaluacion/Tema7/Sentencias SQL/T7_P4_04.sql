SELECT COUNT(L.CODLOC)
FROM LOCALIDAD L, PROVINCIA P
WHERE L.CODPROV = P.CODPROV AND
	P.NOMBRE = 'ALBACETE;'