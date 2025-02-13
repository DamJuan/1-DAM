SELECT  USUARIO, FECHA
FROM    VALORACION 
WHERE   TO_CHAR(FECHA, 'w') = '1' AND
        MONTHS_BETWEEN(SYSDATE, FECHA)/12>1 AND
        TO_CHAR(ADD_MONTHS(FECHA, 12), 'D') IN ('6', '7') AND
        TO_NUMBER(TO_CHAR(ADD_MONTHS(FECHA, 12), 'DD'))<=15;
