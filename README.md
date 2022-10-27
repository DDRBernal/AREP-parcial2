# AREP-parcial2

# Descripción del proyecto

Esta aplicacion web permite identificar si una cadena es palindroma o no y la respuesta será enviada en formato JSON. Para esto utilizaremos SPARK en java y lo desplegaremos en AWS EC2.

Si ejecutamos nuestro programa, podremos realizar una prueba como se muestra en la imagen, donde el formato es igual *espalindromo?value={word}* donde *word* es la palabra que deseemos consultar.

![image](https://user-images.githubusercontent.com/46855679/198156471-a14ed42e-fab8-41b9-ac10-b42d2f1f82ba.png)

## Como correrlo en EC2

Primero debemos generar el jar de nuestro proyecto, para eso debemos ejecutar el comando 

*mvn clean install*

luego nuestro jar sera generado en la carpeta target

![image](https://user-images.githubusercontent.com/46855679/198162700-6de27f91-2c14-4217-9571-1022cbb2f6ed.png)

Ahora pasaremos nuestro archivo jar a nuestra VM como se muestra en la imagen

![image](https://user-images.githubusercontent.com/46855679/198162799-c835529b-399f-4729-b281-0ce51414cb7e.png)

Estos comandos nos servira para entrar al directorio de nuestro jar, y para copiarlo usaremos el comando:

*put arep_parcial2-1.0-SNAPSHOT-jar-with-dependencies.jar*

Para probarlo tendremos que digitar el siguiente comando:

### java -jar ./arep_parcial2-1.0-SNAPSHOT-jar-with-dependencies.jar escuelaing.edu.co.arep_parcial2.Arep_parcial2


![image](https://user-images.githubusercontent.com/46855679/198161765-4f8a1a50-7b6e-4ce1-b016-3afee98b4156.png)

La prueba se muestra a continuacion.

![image](https://user-images.githubusercontent.com/46855679/198163183-611d7558-93d9-44ba-96af-91e033d78cb1.png)

https://youtu.be/XAtU2dqsvRo
