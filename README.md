# TNG24


Instalación

JDK 8 (http://download.oracle.com/otn-pub/java/jdk/8u131-b11/d54c1d3a095b4ff2b6607d096fa80163/jdk-8u131-windows-x64.exe)
 	1- Descargar el jdk 8 e instalarlo. Copiarse el path del __JDK__, no JRE.
 	2- Crear variable de entorno __JAVA_HOME__. Agregala a la variable de entorno PATH 
 	   de la siguiente manera: _%JAVA_HOME%'\bin
 	3- Inicia una consola y ejecuta: java -version y te tiene que decir lo de abajo
 		Java version "1.8.0_131"
		Java(TM) SE Runtime Environment (build 1.8.0_131-b11)
		Java HotSpot(TM) 64-Bit Server VM (build 25.131-b11, mixed mode)
 	 	
 	
 - Maven 3 (http://apache.dattatec.com/maven/maven-3/3.5.0/binaries/apache-maven-3.5.0-bin.zip)
 	1 - Descargate el zip de maven 3. Extrae el archivo y guarda la carpeta en Archivos de programa.
 	2 - Creater la variable de entorno M2_HOME y agrela como a la de JAVA_HOME.
 	3 - >mvn -version y fimate que algo te tira. Si es un error leete todo de nuevo porque no entendiste nada.
 	 
 - GIT BASH (https://git-scm.com/download/win)
    1 - Instalalo campeón.
    
 - MySQL Server (https://dev.mysql.com/downloads/file/?id=470091)
 	1 - Instala solo MySQLServer, NADA MAS. Configura como server de desarrollo, todo siguiente en el password de 'root' es 'gonzalo12'
 	

Chusmeate esto vieja.

GIT (nos paramos en el directorio que tiene el archivo POM.xml)

Vamos a trabajar todos sobre master. 
ojo al commitear, ver que archivos se modificaron y que cosas se modificaron.

1 -Clonar proyecto en el directorio que sea de su preferencia con el siguiente comando:
 > git clone https://github.com/GonzaloFuentes/TNG24.git
 
2 - Mirar las modificaciones de los archivos. Se sale con :q, se guarda con :wq , ENTER ARRIBA Y ABAJO navegacion.
	> git diff <nombre de archivo>

3 - Agregar un archivo
	>git add <archivo>

4 - Commitear archivos agregados
	>git commit -m "<Mensaje significativo de las cosas que se cambiaron EJ: Agrego clasesde dominio y controller OrquestameLosRequestViejaController.java>"

5- Este paso es importante, aca es donde salta la ficha si hay un problema.
   Se hace para bajar los cambios del otro, hacer el merge de los archivos.
   Si hay errores en el merge, arreglarlos manualmente.
   
   >git pull origin master
   
6 - Si todo te salio bien, sos un campeon, pero este paso es la hora de la verdad.
   >git push origin master
   
 	Si todo no te salio bien, no podes pushear.
 	
SI TIENEN DUDAS LLAMEN O ESCRIBAN.

	
	
 
 





