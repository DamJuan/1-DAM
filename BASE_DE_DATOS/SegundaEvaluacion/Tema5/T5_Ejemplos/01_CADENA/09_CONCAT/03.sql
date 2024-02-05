--LAS FUNCIONES SE PUEDEN ANIDAR

SELECT  CONCAT(CONCAT('El cliente se llama: ', nombre), CONCAT(' y vive en ', direccion))
FROM    CLIENTE;

--Esto puede hacerse de forma más sencilla ¿como?