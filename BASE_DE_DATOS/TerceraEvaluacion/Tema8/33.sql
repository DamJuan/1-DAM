SELECT  COUNT(*)
FROM    CICLISTA
WHERE   DORSAL NOT IN (SELECT  DISTINCT DORSAL
                      FROM     LLEVAR);
                      
--TEMA 8
SELECT  COUNT(*)
FROM    CICLISTA C
WHERE   NOT EXISTS (SELECT  *
                   FROM     LLEVAR LL
                   WHERE    C.DORSAL=LL.DORSAL);