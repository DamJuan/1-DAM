SELECT C.NOMBRE, L.NOMBRE LOCALIDAD
FROM CLIENTE C, LOCALIDAD L, CPOSTAL CP
WHERE CP.CODLOC = L.CODLOC AND
	C.CODPOSTAL = CP.CODPOSTAL;