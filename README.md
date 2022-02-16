# AREP- ARQUITECTURAS EMPRESARIAL.

## TALLER CLIENTES Y SERVICIOS

### INTRODUCCIÓN.

El siguiente laboratorio tiene como fin darnos a conocer los esquemas que se tienen de clientes y servicios. 
Además de conocer la forma distribuida de las aplicaciones en internet. Por otra parte, 
tenemos que el laboratorio se encuentra divido en dos PARTES. En primer lugar, tres ejercicios donde se nos solicita realizar diferentes actividades.
Para finalizar, la parte dos, donde deberemos realizar dos retos.

### EJERCICIOS.

#### Ejericcio 1

"Escriba un programa en el cual usted cree un objeto URL e imprima en pantalla cada uno de los componentes de una URL.
Es decir , debe usar los siguientes métodos: getProtocol, getAuthority, getHost, getPort, getPath, getQuery, getFile,
getRef. Asegúrese que ninguno imprima una cadena vacía, esto implica que la URL que use para su objeto debe contener
datos suficientes."

#### Ejericcio 2

"Escriba una aplicación browser que dada una URL lea datos de esa dirección y que los almacene en un archivo con el nombre
resultado.html. Intente ver este archivo en el navegador. Su implementación debe ser un programa que reciba el parámetro
de URL por medio de la línea de comandos."

#### Ejericcio 3

"Usando sockets escriba un servidor que reciba un número y responda el cuadrado de este número. Escriba un cliente para probarlo
y envíele una secuencia de 20 números."

### RETOS.

#### Reto 1

"Escriba un servidor web que soporte multiples solicitudes seguidas (no concurrentes). El servidor debe retornar todos
los archivos solicitados, incluyendo páginas html e imágenes. Construya un sitio web con javascript para probar su 
servidor. Despliegue su solución en Heroku. NO use frameworks web como Spark o Spring use solo Java y las librerías
para manejo de la red."

#### Reto 2

"Usando su servidor y java (NO use frameworks web como Spark o Spring). Escriba un framework similar a Spark que le
permita publicar servicios web "get" con funciones lambda y le permita acceder a recursoso estáticos como páginas,
javascripts, imágenes, y CSSs. Cree una aplicación que conecte con una base de datos desde el servidor para probar
su solución. Despliegue su solución en Heroku."

### DEMOSTRACIÓN EJERCICIOS.

#### Ejericcio 1

![Ejercicio1.png](https://i.postimg.cc/D0BywD3r/Ejercicio1.png)

![Ejercicio1-1.png](https://i.postimg.cc/Kc6ynxJ1/Ejercicio1-1.png)

#### Ejericcio 2

![Ejercicio2.png](https://i.postimg.cc/L8v70pBB/Ejercicio2.png)

![Ejercicio2-1.png](https://i.postimg.cc/tgYrSVgp/Ejercicio2-1.png)

#### Ejericcio 3

![Ejercicio3.png](https://i.postimg.cc/SQ7GGGGc/Ejercicio3.png)

![Ejercicio3-1.png](https://i.postimg.cc/HnBX1BSK/Ejercicio3-1.png)

##### PASOS PARA CLONAR.

-  Nos dirigimos a la parte superior de nuestra ubicación, donde daremos click y escribimos la palabra cmd, luego damos enter, con el fin de desplegar 
el Command Prompt, el cual es necesario.

![img1.png](https://i.postimg.cc/GmSNVZZL/img1.png)

![Imagen2.png](https://i.postimg.cc/vB5N1DDT/Imagen2.png)

![Imagen3.png](https://i.postimg.cc/T3hNVthZ/Imagen3.png)

- Una vez desplegado el Command Prompt, pasamos a verificar que tengamos instalado git, ya que sin él no podremos realizar la descarga.
Para esto ejecutamos el siguiente comando.

`git --version`

![Imagen4.png](https://i.postimg.cc/nh5R0qDM/Imagen4.png)

- Si contamos con git instalado, tendra que salir algo similar. La version puede variar de cuando se este realizando este tutorial. 
Si no cuenta con git, puede ver este tutorial.

[Instalación de Git][id/name] 

[id/name]: https://www.youtube.com/watch?v=cYLapo1FFmA

![Imagen5.png](https://i.postimg.cc/fR6CxZG9/Imagen5.png)

-  Una vez comprobado de que contamos con git. pasamos a escribir el siguiente comando. git clone, 
que significa que clonamos el repositorio, y damos la url del repositorio.

`$ git clone https://github.com/DeividMedina30/TALLER-CLIENTES-Y-SERVICIOS.git`

![Imagen6.png](https://i.postimg.cc/gjkHY0Zf/Imagen6.png)

- Luego podemos acceder al proyecto escribiendo.

`$ cd TALLER-CLIENTES-Y-SERVICIOS`

![Imagen7.png](https://i.postimg.cc/ZKnx2CZN/Imagen7.png)

### DESPLEGANDO API EN HEROKU.

[![ProjectDesign](https://www.herokucdn.com/deploy/button.png)]()


### TECNOLOGÍAS USADAS PARA EL DESARROLLO DEL LABORATORIO.

* [Maven](https://maven.apache.org/) - Administrador de dependencias.

* [Heroku](https://heroku.com) - Plataforma de despliegue en la nube.

### LIMITACIONES.

Para empezar las limitaciones que nos encontramos en este laboratorio, fueron las siguientes.
No se logró realizar ninguno de los retos debido a que no quedo con claridad lo que realmente se
quería solicitar por parte de ellos. Además de no poder desplegarlo en Heroku, debido a la justificación
anterior.

### EXTENDER.

Se espera poder terminar de implementar los retos además de realizar el despliegue en heroku, de
ser posibles realizar pruebas para tanto ejercicios como retos planteados en el laboratorio.

### Documentación

Para generar la documentación se debe ejecutar:
    
`$ mvn javadoc:javadoc`

Esta quedará en la carpeta target/site/apidocs
 
### AUTOR.

> Deivid Sebastián Medina Rativa. 

### Licencia.

Este laboratorio esta bajo la licencia de GNU GENERAL PUBLIC LICENSE.
