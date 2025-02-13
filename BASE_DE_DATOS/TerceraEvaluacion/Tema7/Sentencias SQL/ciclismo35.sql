SELECT DISTINCT C.DORSAL,C.NOMBRE
FROM CICLISTA C, LLEVAR L
WHERE C.DORSAL = L.DORSAL AND
	C.DORSAL NOT IN (SELECT DISTINCT DORSAL
		FROM LLEVAR L1, MAILLOT M
		WHERE C.DORSAL = L1.DORSAL AND
			L1.CODIGO = M.CODIGO AND
			UPPER(M.COLOR) = 'AMARILLO');