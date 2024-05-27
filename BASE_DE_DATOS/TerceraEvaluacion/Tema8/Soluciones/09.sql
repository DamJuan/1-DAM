SELECT    E.DORSAL, NOMBRE, COUNT(*)  
FROM      ETAPA E, CICLISTA C 
WHERE     E.DORSAL=C.DORSAL AND
          NOMEQ IN (SELECT    NOMEQ
                    FROM      CICLISTA
                    GROUP BY  NOMEQ
                    HAVING    COUNT(*)>5)
GROUP BY  E.DORSAL, NOMBRE;