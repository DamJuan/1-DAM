SELECT COUNT(STOCK), MIN(STOCK), ROUND(AVG(STOCK),2), MAX(STOCK)
FROM ARTICULO
WHERE PRECIO BETWEEN 100 AND 300