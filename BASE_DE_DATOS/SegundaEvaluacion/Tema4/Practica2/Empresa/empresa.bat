sqlplus alumno/alumno@pracs @scripts.sql
sqlldr alumno/alumno@pracs control=articulo.ctl
sqlldr alumno/alumno@pracs control=provincia.ctl
sqlldr alumno/alumno@pracs control=localidad.ctl
sqlldr alumno/alumno@pracs control=cpostal.ctl
sqlldr alumno/alumno@pracs control=cliente.ctl
sqlldr alumno/alumno@pracs control=vendedor.ctl
sqlldr alumno/alumno@pracs control=factura.ctl
sqlldr alumno/alumno@pracs control=factura_linea.ctl
sqlplus alumno/alumno@pracs @003_Modificar_tablas.sql