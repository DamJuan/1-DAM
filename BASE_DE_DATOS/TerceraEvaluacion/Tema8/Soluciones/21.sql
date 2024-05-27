--VERSIÓN  NOT IN
SELECT  NOMBRE 
FROM    CICLISTA
WHERE   DORSAL NOT IN  (SELECT DISTINCT DORSAL
                       FROM ETAPA);
                       
--VERSIÓN NOT EXISTS
SELECT  NOMBRE 
FROM    CICLISTA
WHERE   NOT EXISTS (SELECT  * 
                   FROM     ETAPA
                   WHERE    ETAPA.DORSAL=CICLISTA.DORSAL);                       