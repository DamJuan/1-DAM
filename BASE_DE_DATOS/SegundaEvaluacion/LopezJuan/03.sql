SELECT	*
FROM	VISITA
WHERE	(UPPER(DIAGNOSTICO) LIKE '%RESFRIADO%' OR UPPER(DIAGNOSTICO) LIKE '%CALMANTE%' OR UPPER(DIAGNOSTICO) LIKE '%ANTI%') AND
	(SALA LIKE '%11%') AND 
	(TO_CHAR (FECHA,'MM')='01' OR TO_CHAR (FECHA,'MM')='02' OR TO_CHAR (FECHA,'MM')='03')