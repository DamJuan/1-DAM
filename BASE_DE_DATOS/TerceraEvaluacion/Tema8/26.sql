SELECT  SALIDA, LLEGADA
FROM    ETAPA, PUERTO
WHERE   ETAPA.NETAPA=PUERTO.NETAPA AND
        PENDIENTE = (SELECT MAX (PENDIENTE)
                    FROM    PUERTO)
                    
-- PREGUNTA: podr�a salir m�s de una fila?                    