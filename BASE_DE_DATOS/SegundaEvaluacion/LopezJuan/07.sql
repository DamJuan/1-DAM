SELECT	LTRIM(RTRIM(TRANSLATE(INITCAP(NOMBRE),'0123456789',' '))) AS PACIENTE, ALTA
FROM	PACIENTE
WHERE	TO_NUMBER(TO_CHAR(ALTA, 'YYYY'))< TO_NUMBER(TO_CHAR(SYSDATE,'YYYY'))-1;
