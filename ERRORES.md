# Errores

## Errores que vulneran los principios SOLID

### ./files

+   Las interfaces y abstracciones se alojan en el mismo paquete que los
modulos de bajo nivel, vulnerando el DIP. [Referencia](https://youtu.be/8Z0pBlef1qM?si=HalCp0SX8DlUfJtY&t=911)

### ./files/Directory.java

+ No todos sus metodos se utilizan, vulnerando el ISP.

### ./files/File.java

+ No todos sus metodos se utilizan, vulnerando el ISP.
+ Un metodo lanza una excepcion no controlada por el padre, vulnerando el LSP

### ./files/FileSystemItem.java

+ Realiza mas funciones de las esperadas, vulnerando el SRP

### ./service/FileManager.java

+ Depende de clases concretas en lugar de abstracciones, vulnerando el ISP
+ En los metodos, las clases que derivan del mismo padre no pueden ser sustituidos con facilidad, vulnerando el LSP
+ Mediante las condiciones por instancia, hace imposible no modificar el fichero para nuevas implementaciones, vulnerando el OCP

