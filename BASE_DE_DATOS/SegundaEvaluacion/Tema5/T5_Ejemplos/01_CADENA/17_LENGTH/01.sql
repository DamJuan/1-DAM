--LENGTH (cad1)

SELECT  CODART, LENGTH (CODART)
FROM    ARTICULO
WHERE   LENGTH(CODART)<6;