CREATE USER RECETAS IDENTIFIED BY RECETAS
DEFAULT TABLESPACE EXAMPLE 
TEMPORARY TABLESPACE TEMP
QUOTA UNLIMITED ON EXAMPLE;

GRANT CREATE SESSION, CREATE TABLE TO RECETAS;