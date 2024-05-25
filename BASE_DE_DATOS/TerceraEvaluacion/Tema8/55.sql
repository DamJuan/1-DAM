--TEMA 7
SELECT  NOMBRE 
FROM    CICLISTA
WHERE   DORSAL NOT IN  (SELECT DISTINCT DORSAL
                       FROM ETAPA);
    
--TEMA 8                   
SELECT  NOMBRE 
FROM    CICLISTA
WHERE   NOT EXISTS (SELECT  * 
                   FROM     ETAPA
                   WHERE    ETAPA.DORSAL=CICLISTA.DORSAL);                       