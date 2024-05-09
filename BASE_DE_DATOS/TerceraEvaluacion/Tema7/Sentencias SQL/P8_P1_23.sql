SELECT      COUNT(C.CODCLI)
FROM        CLIENTE C, CPOSTAL CP
WHERE       C.CODPOSTAL = CP.CODPOSTAL
GROUP BY    CP.CODLOC
HAVING      COUNT(C.CODCLI) = (SELECT      MAX(COUNT(C.CODCLI))
                                    FROM   CLIENTE C, CPOSTAL CP
                                    WHERE       C.CODPOSTAL = CP.CODPOSTAL
                                    GROUP BY    CP.CODLOC);