--TO_CHAR(dato[, 'formato'])
--Se pueden utilizar varias mascaras en la cadena de formato
--Se pueden insertar caracteres literales entre "" en la cadena de formato

SELECT  TO_CHAR(FECHA, ' "La factura es del mes: " MM MONTH month Month MONth') TEXTO,
        'La factura es del mes: ' || TO_CHAR(FECHA, 'MM MONTH month Month MONth') TEXTO
FROM    FACTURA;