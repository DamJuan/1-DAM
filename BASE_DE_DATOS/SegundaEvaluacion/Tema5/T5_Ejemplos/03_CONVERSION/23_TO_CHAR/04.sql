--TO_CHAR(dato[, 'formato'])
--Car�cteres de formato NUM�RICO

SELECT  PRECIO, TO_CHAR(CEIL(PRECIO), 'RN')
FROM    ARTICULO;
       