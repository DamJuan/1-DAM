--LPAD(cad1, n, [cad2]), RPAD(cad1, n, [cad2])

SELECT  LPAD('BASES', 10, '*-'), RPAD('BASES', 10, '*-')
FROM    DUAL;