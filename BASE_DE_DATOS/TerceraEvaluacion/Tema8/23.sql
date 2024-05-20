SELECT  NETAPA, SALIDA
FROM    ETAPA
WHERE   NETAPA NOT IN (SELECT DISTINCT NETAPA
                      FROM    PUERTO);
                      
--TEMA 8
SELECT  NETAPA, SALIDA
FROM    ETAPA
WHERE   NOT EXISTS (SELECT  *
                    FROM    PUERTO
                    WHERE   PUERTO.NETAPA=ETAPA.NETAPA);               
 
        
        