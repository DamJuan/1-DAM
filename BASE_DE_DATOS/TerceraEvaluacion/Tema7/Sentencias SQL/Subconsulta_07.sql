SELECT CODCLI, NOMBRE, CODPOSTAL
FROM CLIENTE
WHERE CODPOSTAL IN (SELECT CODPOSTAL
			FROM CPOSTAL
			WHERE CODLOC IN (SELECT CODLOC
					FROM LOCALIDAD
					WHERE NOMBRE ='VILLAREAL'))