SELECT      V.CODVEN, V.NOMBRE
FROM        VENDEDOR V, FACTURA F
WHERE       V.CODVEN = F.CODVEN
GROUP BY    V.CODVEN, V.NOMBRE
HAVING      COUNT(F.CODFAC) = (SELECT       MAX(COUNT(F.CODFAC))
                                FROM        VENDEDOR V, FACTURA F
                                WHERE       V.CODVEN = F.CODVEN
                                GROUP BY    V.CODVEN)