# UD1-Practica1-Programacion-multiprocesos

## Documentación del Proyecto: Contador de Vocales en Texto

### Descripción General

El proyecto tiene como objetivo contar el número de vocales en un texto que se encuentra en un fichero `.txt`, utilizando un enfoque multiproceso. El programa principal crea un subproceso por cada vocal y cada línea del texto, y cada subproceso cuenta la cantidad de una vocal específica en una línea específica. Los resultados son luego recopilados y presentados por el proceso principal.

### Estructura del Código

#### 1. `Main`

- **Responsabilidad**: Coordinar la ejecución de los subprocesos y presentar los resultados finales.
- **Métodos Principales**:
    - `main(String[] args)`: Punto de entrada del programa.

#### 2. `ProcessLauncher`

- **Responsabilidad**: Inicializar y lanzar subprocesos.
- **Métodos Principales**:
    - `initContadorVocalProcess(String vocal, String line)`: Inicia un subproceso para contar una vocal específica en una línea específica.

#### 3. `VocalCounter`

- **Responsabilidad**: Contar el número de ocurrencias de una vocal específica en una línea de texto.
- **Métodos Principales**:
    - `main(String[] args)`: Punto de entrada del subproceso.

#### 4. `WordCounter` (Nota: Este no se usa en el código proporcionado)

- **Responsabilidad**: Contar el número de palabras en una línea de texto.
- **Métodos Principales**:
    - `main(String[] args)`: Punto de entrada del subproceso.

#### 5. `Utils`

- **Responsabilidad**: Proporcionar métodos de utilidad para operaciones de archivo.
- **Métodos Principales**:
    - `getAllLines(String fileRoute)`: Leer todas las líneas de un archivo y devolverlas como una lista.
    - `getTotalWordsFrom(String fileRoute)`: Obtener el total de palabras desde un archivo (Nota: Este método no se usa en el código proporcionado).

### Flujo de Ejecución

1. **Leer el Texto**: `Main` utiliza `Utils.getAllLines` para leer todas las líneas del archivo de texto.

2. **Inicializar Subprocesos**: Para cada vocal y cada línea del texto, `Main` utiliza `ProcessLauncher.initContadorVocalProcess` para crear un subproceso que cuenta la cantidad de la vocal en la línea utilizando `VocalCounter`.

3. **Esperar y Recopilar Resultados**: `Main` espera a que todos los subprocesos terminen y recopila sus resultados.

4. **Presentar Resultados**: `Main` muestra el recuento de cada vocal y el total de vocales.



