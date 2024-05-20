SELECT  NOMBRE
FROM    CICLISTA
WHERE   EDAD= (SELECT MIN (EDAD)
              FROM    CICLISTA);
              
-- PREGUNTA: podría salir más de una fila?