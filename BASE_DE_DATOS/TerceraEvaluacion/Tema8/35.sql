SELECT  DISTINCT C.DORSAL, NOMBRE
FROM    CICLISTA C, LLEVAR LL
WHERE   C.DORSAL=LL.DORSAL AND
        C.DORSAL NOT IN (SELECT  DISTINCT DORSAL
                        FROM     LLEVAR LL1, MAILLOT M
                        WHERE    C.DORSAL=LL1.DORSAL AND
                                 LL1.CODIGO=M.CODIGO AND
                                 M.COLOR='Amarillo');
                                 
--TEMA 8
SELECT  DISTINCT C.DORSAL, NOMBRE
FROM    CICLISTA C, LLEVAR LL
WHERE   C.DORSAL=LL.DORSAL AND --HAN LLEVADO ALGÚN MAILLOT
        NOT EXISTS (SELECT  *
                   FROM     LLEVAR LL1, MAILLOT M
                   WHERE    C.DORSAL=LL1.DORSAL AND
                            LL1.CODIGO=M.CODIGO AND
                            M.COLOR='Amarillo');                                 