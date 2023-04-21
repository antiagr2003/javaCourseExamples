# Parsing de ficheros JSON con librerías
## Utilización de la librería de Google GSON con Maven

Descarga de MAVEN: https://maven.apache.org/download.cgi

Fichero pom.xml de configuración:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>edu.comillas.gitt</groupId>
  <artifactId>EjemploJSON</artifactId>
  <packaging>jar</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>EjemploJSON</name>
  <url>http://maven.apache.org</url>
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
        <configuration>
            <source>1.8</source>
            <target>1.8</target>
        </configuration>
      </plugin>
      <plugin>
        <artifactId>maven-assembly-plugin</artifactId>
        <executions>
          <execution>
            <phase>package</phase>
            <goals>
              <goal>single</goal>
            </goals>
          </execution>
        </executions>
        <configuration>
          <archive>
            <manifest>
              <mainClass>App</mainClass>
            </manifest>
          </archive>          
          <descriptorRefs>
            <descriptorRef>jar-with-dependencies</descriptorRef>
          </descriptorRefs>
        </configuration>
      </plugin>      
    </plugins>
    </build>
   <dependencies>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.2</version>
        </dependency>
    </dependencies>
</project>
```

```bash
$ mvn package
[INFO] Scanning for projects...
[INFO]
[INFO] -------------------< edu.comillas.gitt:EjemploJSON >--------------------
[INFO] Building EjemploJSON 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-assembly-plugin:2.2-beta-5:single (default) @ EjemploJSON ---
[INFO] Building jar: C:\Users\David\Documents\Dropbox\Departamentos\Poo\sources\javaCourseExamples\12c6.json\target\EjemploJSON-1.0-SNAPSHOT-jar-with-dependencies.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.638 s
[INFO] Finished at: 2022-04-20T14:54:04+02:00
[INFO] ------------------------------------------------------------------------
```
Generará como resultado un fichero "ejecutable" JAR en la carpeta target: **EjemploJSON-1.0-SNAPSHOT-jar-with-dependencies.jar**

