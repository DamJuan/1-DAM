SELECT  ROUND(AVG(EDAD),2)
FROM    CICLISTA
WHERE   DORSAL IN (SELECT DISTINCT DORSAL
                  FROM ETAPA);

--CUIDADO AL HACER ESTO
SELECT  ROUND(AVG(EDAD),2)
FROM    ETAPA, CICLISTA
WHERE   ETAPA.DORSAL=CICLISTA.DORSAL; 
                      
-- CUESTIONES: 
  --1.- No dan el mismo resultado �por qu�?
        --La segunda puede sumar un ciclista m�s de una vez, tantas como etapas haya ganado                    
 
        
        