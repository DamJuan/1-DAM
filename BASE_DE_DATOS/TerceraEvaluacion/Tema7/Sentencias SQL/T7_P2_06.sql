SELECT C.NOMBRE, L.NOMBRE
FROM CLIENTE C, CPOSTAL CP, PROVINCIA P, LOCALIDAD L
WHERE C.CODPOSTAL = CP.CODPOSTAL AND 
	P.CODPROV = L.CODPROV AND 
	CP.CODLOC = L.CODLOC AND 
	UPPER(P.NOMBRE) LIKE 'CUENCA';