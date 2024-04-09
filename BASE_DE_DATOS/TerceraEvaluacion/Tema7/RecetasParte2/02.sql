SELECT  'La receta: ' || codrec || ' contiene ' || to_char(cant) || ' ' ||  medida || ' en su desglose de ingredientes' "LEYENDA PATATAS"
FROM    DESGLOSE
WHERE   CODING= 'ING005';