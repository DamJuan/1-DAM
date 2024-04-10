ALTER SESSION SET NLS_DATE_FORMAT = 'DD/MM/YYYY';

-- USUARIO
INSERT INTO USUARIO (NOMUSU, PROCEDENCIA, EMAIL, ALTA, PWD) VALUES ('pepe96', 'Valencia', 'pepe96elmejor@gmail.com', '16/03/2021', 'pepe123456');
INSERT INTO USUARIO (NOMUSU, PROCEDENCIA, EMAIL, ALTA, PWD) VALUES ('evildark666', 'Valencia', 'evildark666@gmail.com', '04/01/2020', 'yonosoyekas');
INSERT INTO USUARIO (NOMUSU, PROCEDENCIA, EMAIL, ALTA, PWD) VALUES ('albertochicote', 'Madrid', 'albertochicote746@hotmail.com', '19/12/2019', 'estoysobrevalorado');
INSERT INTO USUARIO (NOMUSU, PROCEDENCIA, EMAIL, ALTA, PWD) VALUES ('LAGATARATA', 'Madrid', 'GATUNA@msn.com', '19/03/2020', 'CONFINADA100');
INSERT INTO USUARIO (NOMUSU, PROCEDENCIA, EMAIL, ALTA, PWD) VALUES ('Rascapica', 'SALAMANCA', 'RASCAYPICA123@hotmail.com', '07/07/2019', 'SIMPSONA2');
INSERT INTO USUARIO (NOMUSU, PROCEDENCIA, EMAIL, ALTA, PWD) VALUES ('SHERLOCK', 'ANDALUCIA', 'soysherlock@gmz.com', '07/07/2019', 'jwatson123');

COMMIT;

-- INGREDIENTE
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING001', 'Pan de molde', 'Pan de barra, pan cuadrado, pan lacteado, pan de sándwich', 250);
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING002', 'Queso havarti', 'Queso típico de Dinamarca elaborado con leche de vaca.', 417);
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING003', 'Jamón cocido', 'El jamón de York o jamón cocido es un fiambre cocido, derivado cárnico del cerdo.', 195);
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING004', 'Mantequilla', 'Emulsión de grasa, agua y sólidos lácteos, obtenida como resultado del batido, amasado y lavado de los conglomerados de lóbulos grasos.', 717);
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING005', 'Patata', 'La papa o patata (Solanum tuberosum) es una especie de planta herbácea perteneciente al género Solanum.', 77);
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING006', 'Aceite de oliva', 'El aceite de oliva es un aceite vegetal de uso principalmente culinario que se extrae del fruto del olivo.', 884);
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING007', 'Huevo', 'Los huevos son una fuente barata y rica de proteínas, y en casi todas sus preparaciones son muy digestivos,1 también son ricos en vitaminas.', 155);
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING008', 'Sal', 'La sal común o sal de mesa.', 0);
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING009', 'LENTEJA PARDINA', 'La LEGUMBRE por excelencia.', 90 );
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING010', 'Chorizo sarta', null, 435);
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING011', 'Cebolla seca', null, 40);
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING012', 'NATA MONTAR', null, 400);
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING013', 'YOGUR', null, 190);
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING014', 'MELOCOTÓN EN ALMIBAR', null, 70);
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING015', 'HOJAS GELATINA', null,17 );
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING016', 'CARNE PICADA TERNERA', null, null );
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING017', 'QUESO RALLADO', null, null );
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING020', 'TOMATE FRITO', null,  null );
INSERT INTO INGREDIENTE (CODING, NOMBRE, DESCRIP, CALORIAS) VALUES ('ING021', 'PIMIENTA', null, null );
COMMIT;

-- RECETA
INSERT INTO RECETA (CODREC, TITULO, USUARIO, PROCEDENCIA, DIFICULTAD) VALUES ('REC1', 'Sandwich Mixto', 'pepe96', 'Reino Unido', 'FÁCIL');
INSERT INTO RECETA (CODREC, TITULO, USUARIO, PROCEDENCIA, DIFICULTAD) VALUES ('REC2', 'Tortilla Española', 'evildark666', 'España', 'MEDIA');
INSERT INTO RECETA (CODREC, TITULO, USUARIO, PROCEDENCIA, DIFICULTAD) VALUES ('REC3', 'LENTEJAS CON CHORIZO', 'evildark666', 'España', 'DIFÍCIL');
INSERT INTO RECETA (CODREC, TITULO, USUARIO, PROCEDENCIA, DIFICULTAD) VALUES ('REC4', 'Tortilla FRANCESA', 'evildark666', 'España', 'FÁCIL');
INSERT INTO RECETA (CODREC, TITULO, USUARIO, PROCEDENCIA, DIFICULTAD) VALUES ('REC5', 'PATATAS RELLENAS DE CARNE', 'albertochicote', 'España', 'MEDIA');
INSERT INTO RECETA (CODREC, TITULO, USUARIO, PROCEDENCIA, DIFICULTAD) VALUES ('REC6', 'FLAN DE YOGUR Y MELOCOTÓN', 'albertochicote', 'España', 'MEDIA');
COMMIT;

-- DESGLOSE
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC1', 'ING001', 300, 'gr');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC1', 'ING002', 160.5, 'gr');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC1', 'ING003', 139.3, 'gr');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC1', 'ING004', 20, 'gr');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC2', 'ING006', 10, 'ml');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC2', 'ING005', 10, 'ud');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC2', 'ING008', 5, 'mg');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC2', 'ING007', 4, 'ud');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC3', 'ING009', 300, 'gr');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC3', 'ING010', 0.5, 'ud');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC3', 'ING011', 0.5, 'ud');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC3', 'ING005', 1, 'ud');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC3', 'ING008', 5, 'mg');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC6', 'ING012', 200, 'ml');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC6', 'ING013', 250, 'gr');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC6', 'ING014', 350, 'gr');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC6', 'ING015', 6, 'ud');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC5', 'ING005', 6, 'ud');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC5', 'ING016', 200, 'gr');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC5', 'ING020', 250, 'ml');
INSERT INTO DESGLOSE (CODREC, CODING, CANT, MEDIDA) VALUES ('REC5', 'ING017', 100, 'gr');
COMMIT;

-- PASOS
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (1, 'REC1', 'Unta las rebanadas de pan de molde con la mantequilla por ambas caras. Para que te sea más sencillo trabajar, lo ideal es que trabajes con mantequilla en pomada. Esta expresión se refiere a la mantequilla cuando está blandita pero no derretida. Es el punto exacto en el que está maleable y se puede trabajar con ella.');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (2, 'REC1', 'Coloca entre las rebanadas de pan de molde las lonchas de jamón y de queso.');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (3, 'REC1', 'Tuesta tu sándwich mixto perfecto en una plancha o en una sartén hasta que el queso se derrita y el pan quede dorado por ambos lados.');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (4, 'REC1', 'Deja reposar unos instantes, apartado del fuego, pero al calor de la plancha, y sirve inmediatamente.');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (1, 'REC2', 'Pelamos las patatas, las lavamos para quitar restos de suciedad y muy importante, las secamos. Cortamos en láminas semifinas. Las colocamos en un bol grande, donde luego vamos a mezclar con el huevo y añadimos sal al gusto. Removemos bien y reservamos.');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (2, 'REC2', 'Elegimos nuestra sartén más grande y antiadherente. La ponemos al fuego y añadimos un buen aceite de oliva.');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (3, 'REC2', 'Introducimos las patatas cortadas y ya saladas y dejamos que se cocinen durante aproximadamente veinte minutos a fuego bajo. El tema del grosor de las patatas también va a gustos y hay quien prefiere cortarlas a trozos muy pequeños, en láminas muy finas que casi se rompan al freír y o más bien grandes.');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (4, 'REC2', 'Mientras se están friendo las patatas, en el bol donde luego vamos a echar las patatas batimos los huevos, reservamos. ');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (5, 'REC2', 'Añadimos al bol con el huevo batido.');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (1, 'REC3', 'Cortar la patata, la cebolla y el chorizo en trozos pequeños.');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (2, 'REC3', 'AÑADIR TODO LO CORTADO JUNTO CON LAS LENTEJAS Y LA SAL A UN CAZO CON AGUA');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (3, 'REC3', 'hervir una hora Y A VER QUE MEJUNJE SALE :)');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (1, 'REC5', 'Lavamos bien las patatas y las cocemos con su piel en agua con sal . También las puedes cocer al vapor en vaporera al fuego o en el microondas. Pelamos las patatas ya cocidas y las reservamos al frío para que sea más fácil manipularlas');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (2, 'REC5', 'Con la carne picada vamos a preparar una boloñesa espesa. Rehogamos la cebolla picada en aceite y cuando empiece a tomar color añadimos la carne. La vamos separando con la espumadera, salpimentamos, ponemos la nuez moscada y seguimos removiendo hasta que la carne esté cocida. Añadimos el tomate y dejamos reducir y espesar la salsa por 7 u 8 minutos. Probamos de sal y retiramos');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (3, 'REC5', 'Precalentamos el horno a 200° C');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (4, 'REC5', 'Preparamos la salsa bechamel con una cucharada de harina, una cucharada de mantequilla y un vaso de leche');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (5, 'REC5', 'Para montar el plato, cortamos las patatas peladas por la mitad. Recuerda que deben estar ya frías para que no se desmoronen');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (6, 'REC5', 'La vaciamos con una cucharita (guarda esa patata para purés o cremas) y cortamos un poquito la base para que se asienten. Rellenamos con la boloñesa, cubrimos con bechamel y con queso rallado y gratinamos bajo el grill hasta que doren. Servimos al momento, bien calientes.');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (1, 'REC6', 'Troceamos los melocotones en daditos y reservamos uno cortado en láminas para la decoración. Reservamos también el almíbar de la lata.');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (2, 'REC6', 'Ponemos a hidratar las hojas de gelatina neutra en agua fría.');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (3, 'REC6', 'Montamos la nata y reservamos');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (4, 'REC6', 'Calentamos en el microondas el almíbar de la lata y disolvemos en él la gelatina una vez hidratada y bien escurrida.Después lo ponemos otros 30-40 segundos en el microondas para asegurarnos que la gelatina esté bien disuelta e integrada. Recuerda que debe estar caliente pero no puede hervir porque la gelatina no cuaja');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (5, 'REC6', 'Añadimos el yogur y mezclamos bien');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (6, 'REC6', 'Incorporamos el melocotón en daditos y vamos añadiendo también la nata montada, mezclando con una espátula lentamente');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (7, 'REC6', 'Vertemos la mezcla en moldes individuales de flan y llevamos a la nevera un mínimo de 4 horas, hasta que cuaje bien.');
INSERT INTO PASOS (NUMERO,CODREC, DESCRIP) VALUES (8, 'REC6', 'Decoramos con el melocotón en láminas que habíamos reservado y unas hojitas de menta');
COMMIT;

-- VALORACION
INSERT INTO VALORACION (CODREC, USUARIO, OPINION, PUNTUACION, FECHA) VALUES ('REC1', 'albertochicote', 'Este plato es comida de gato ', 2, '19/01/2022');
INSERT INTO VALORACION (CODREC, USUARIO, OPINION, PUNTUACION, FECHA) VALUES ('REC1', 'evildark666', 'Me gusta mucho este sandwich lo malo es que con el pan de hacendado queda un poco malo', 8, '05/02/2022');
INSERT INTO VALORACION (CODREC, USUARIO, OPINION, PUNTUACION, FECHA) VALUES ('REC2', 'pepe96', 'La tortilla como la española ninguna, buenísima! Si es que.. en España se come mejor VIVA LA COMIDA ESPAÑOLA!', 10, '18/03/2022');
INSERT INTO VALORACION (CODREC, USUARIO, OPINION, PUNTUACION, FECHA) VALUES ('REC2', 'evildark666', 'Le doy un 4 a esta receta porque ha venido el cartero, se me ha quemao y no he podido terminarla. No me gusta dejar las cosas por la mit', 4, '06/02/2022');
INSERT INTO VALORACION (CODREC, USUARIO, OPINION, PUNTUACION, FECHA) VALUES ('REC3', 'LAGATARATA', 'ME HA SALIDO PERFECTA. BIEN EXPLICADA', 7, '06/04/2020');
INSERT INTO VALORACION (CODREC, USUARIO, OPINION, PUNTUACION, FECHA) VALUES ('REC3', 'pepe96', 'ASQUEROSAS. CEMENTO ARMADO', 3, '04/05/2021');
INSERT INTO VALORACION (CODREC, USUARIO, OPINION, PUNTUACION, FECHA) VALUES ('REC2', 'Rascapica', 'ME HAN GUSTADO. Aunque he hecho para un regimiento. Repartiré', 8, '01/08/2019');
INSERT INTO VALORACION (CODREC, USUARIO, OPINION, PUNTUACION, FECHA) VALUES ('REC3', 'Rascapica', 'ME HAN GUSTADO. Repetiré', 8, '14/09/2021');

COMMIT;