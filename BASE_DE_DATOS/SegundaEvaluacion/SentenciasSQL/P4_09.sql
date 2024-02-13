SELECT LOWER(TRIM(BOTH '.' FROM TRIM(BOTH '"' FROM titulo))) AS titulo_modificado
FROM MISTEXTOS;


SELECT LOWER(REPLACE(REPLACE(titulo, '.', ''), '"', '')) AS titulo_modificado
FROM MISTEXTOS;
