SELECT  NOMBRE
FROM    CICLISTA
WHERE   EDAD= (SELECT MIN (EDAD)
              FROM    CICLISTA);
              
-- PREGUNTA: podr�a salir m�s de una fila?