SELECT  DORSAL, NOMBRE
FROM    CICLISTA
WHERE   DORSAL NOT IN (SELECT  DORSAL
                      FROM     ETAPA);
--TEMA 8
SELECT  DORSAL, NOMBRE
FROM    CICLISTA C
WHERE   NOT EXISTS (SELECT  *
                   FROM     ETAPA E
                   WHERE    C.DORSAL=E.DORSAL);
                   

                   
                           