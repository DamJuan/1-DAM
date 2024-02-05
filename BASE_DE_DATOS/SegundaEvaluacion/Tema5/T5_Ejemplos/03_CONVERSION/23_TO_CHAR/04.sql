--TO_CHAR(dato[, 'formato'])
--Carácteres de formato NUMÉRICO

SELECT  PRECIO, TO_CHAR(CEIL(PRECIO), 'RN')
FROM    ARTICULO;
       