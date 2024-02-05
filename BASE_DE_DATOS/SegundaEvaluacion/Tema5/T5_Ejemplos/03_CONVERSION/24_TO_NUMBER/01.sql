--TO_NUMBER(cad[, 'formato'])
--DEVUELVE UN NUMERO!!
--La cadena tiene que poder ser transformada a numero

SELECT  CODPOSTAL, TO_NUMBER(CODPOSTAL)
FROM    CLIENTE;