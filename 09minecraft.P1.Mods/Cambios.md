# Práctica 1. Creación del Mod y Mappings
## Modificaciones a realizar en ficheros

#### Cambio 1

```gradle
maven { url = 'https://maven.parchmentmc.org' }
```

```gradle
repositories {
    // These repositories are only for Gradle plugins, put any other repositories in the repository block further below
    maven { url = 'https://maven.minecraftforge.net' }
    maven { url = 'https://maven.parchmentmc.org' }
    mavenCentral()
}
```
#### Cambio 2

```gradle
classpath 'org.parchmentmc:librarian:1.+'
```

```gradle
dependencies {
    classpath group: 'net.minecraftforge.gradle', name: 'ForgeGradle', version: '5.1.+', changing: true
    classpath 'org.parchmentmc:librarian:1.+'
}
```

#### Cambio 3

```gradle
apply plugin: 'org.parchmentmc.librarian.forgegradle'
```

```gradle
apply plugin: 'net.minecraftforge.gradle'
// Only edit below this line, the above code adds and enables the necessary things for Forge to be setup.
apply plugin: 'org.parchmentmc.librarian.forgegradle'
apply plugin: 'eclipse'
apply plugin: 'maven-publish'
```

#### Cambio 4

```gradle
version = '1.0'
group = 'com.comillas.mod_icai' // http://maven.apache.org/guides/mini/guide-naming-conventions.html
archivesBaseName = 'mod_icai'
```

#### Cambio 4
##### mods.toml

```gradle
modLoader="javafml" #mandatory
loaderVersion="[37,)" #mandatory This is typically bumped every Minecraft version by Forge. See our download page for lists of versions.
license="All rights reserved"
[[mods]] #mandatory
modId="mod_icai" #mandatory
version="${file.jarVersion}" #mandatory
displayName="Example Mod" #mandatory
logoFile="mod_icai.png" #optional
credits="Mod creado para la asignatura de ICAI" #optional
authors="David Contreras" #optional
description='''
Mod realizado para aprender Java en la asignatura de Programación Orientada a Objetos.

ICAI - Universidad Pontificia Comillas
'''
[[dependencies.mod_icai]] #optional
    modId="forge" #mandatory
    mandatory=true #mandatory
    versionRange="[37,)" #mandatory
    ordering="NONE"
    side="BOTH"
[[dependencies.mod_icai]]
    modId="minecraft"
    mandatory=true
    versionRange="[1.17.1,1.18)"
    ordering="NONE"
    side="BOTH"
```