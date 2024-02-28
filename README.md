# AREP-Taller-5
Jose Alejandro Correa Rodriguez
En este taller se tuvo como objetivo realizar un servidor web utilizando Spark y que respondiera a ciertas peticiones y tambien se subiera la imagen del contenedor a Docker

## Para ejecutar el programa

Se puede hacer uso del comando git clone y usar la URL del repositorio:
```
https://github.com/jacro103/taller04-arep.git
```

## Prerequisitos

Es necesario tener instalado maven para compilar y probar los test del programa, si no se tiene maven puede instalar [aqui](https://maven.apache.org/install.html).

## Instalacion 

Una vez clonado, se debe hacer uso del comando:

```
mvn package
```

Este comando compilara el programa y tambien ejecutara las pruebas. 

## Despliegue del programa:

Para ejecutar el programa se usa el comando:

```
java -cp "target/classes;target/dependency/*" com.mycompany.taller04.arep.SparkWebServer
```
Una vez ejecutado se debe acceder a traves de un buscador y con la direccion:
```
localhost:4567
```

## Descripcion del programa:

### Diseño:

En este programa se usa la clase SparkWebServer para realizar la implementacion de las respuestas a peticiones desde un cliente usando el framework Spark.

### Implementacion:

#### Desarrollo servidor:

Para comenzar se realizaron los metodos para responder a las diferentes implementaciones que se requerian

Aqui podemos ver las cuatro implementaciones requeridas:

* Determinar el Seno de un valor.
* Determinar el Coseno de un valor.
* Determinar si una palabra es palindroma.
* Deteminar la magnitud de un vector real de dos dimensiones.


#### Construccion de imagenes en Docker:

Para empezar se debe tener Docker Desktop instalado en el computador, y crearemos un archivo Dockerfile en la raiz del proyecto:<br>


Ahora utilizaremos el siguiente comando para construir la imagen:<br>

```
docker build --tag dockersparkprimer .
```


Y ahora usando:

```
docker images
```



Ahora crearemos tres contenedores usando:

```
docker run -d -p 34000:6000 --name firstdockercontainer dockersparkprimer
docker run -d -p 34001:6000 --name firstdockercontainer2 dockersparkprimer
docker run -d -p 34002:6000 --name firstdockercontainer3 dockersparkprimer
```


Y usando el siguiente comando verificamos el estado de los contenedores:

```
docker ps
```


Y ahora accedemos a la siguiente url y verificamos el estado de los contenedores:

```
localhost:34000
localhost:34001
localhost:34002
```



Ahora crearemos un archivo docker-compose.yml en la raiz del directorio

Y ejecutamos el siguiente comando:

```
docker-compose up -d
```


Usando el siguiente comando verificamos los servicios:

```
docker ps
```



Ahora subiremos la imagen a un repositorio en la web de [Docker](https://www.docker.com).<br>

Para empezar crearemos un repositorio

Y ahora crearemos una referencia local de la imagen con el siguiente comando:

```
docker tag dockersparkprimer jacro103/lab04taller
```



Ahora nos autenticamos en nuestra cuenta de docker y subimos la imagen al repositorio:

```
docker push jacro103/lab04taller:latest
```


El repositorio donde esta subida es:

```
https://hub.docker.com/r/jacro103/lab04taller
```

Para correr la imagen podemos hacer el siguiente proceso:

1. Hacemos ```docker pull jacro103/lab04taller``` para descargar la imagen desde el repositorio.

2. Usamos ```docker ps``` para poder ver en que puerto esta escuchando el servidor




## Construido con:

* [Maven](https://maven.apache.org/) - Manejo de dependecias.

* [Docker](https://www.docker.com) - Creacion de imagenes.

## Autor


