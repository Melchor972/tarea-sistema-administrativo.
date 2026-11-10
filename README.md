# Sistema Administrativo para Stands de la Filey

## Descripción del Proyecto
Sistema desarrollado en Java bajo la Programación Orientada a Objetos para gestionar la asignación, precios, estados y notificaciones de los stands de la feria.

## Video Explicativo del Código
Puedes ver la explicación detallada del programa en el siguiente enlace:
https://alumnosuady-my.sharepoint.com/:v:/g/personal/a25216423_alumnos_uady_mx/IQAOfkM4a-qCQZnDp2YGi2WKAQipNU-19aNJB1mgs7Msabo?e=YT5KKv


## 1. Requerimientos Funcionales y No Funcionales
Requerimientos Funcionales Ampliados
1.	RF-01: Gestión y Registro de Stands
o	Descripción: El sistema debe permitir registrar y administrar cada espacio de la feria con un identificador único (id), sus dimensiones físicas, los metros cuadrados exactos, el cálculo automático de su precio y su estado actual (DISPONIBLE, RESERVADO, OCUPADO, BLOQUEADO). 
o	Nivel de importancia: Alta
2.	RF-02: Configuración Global de Tarifas y Plazos
o	Descripción: El sistema debe almacenar parámetros globales que incluyan el costo por metro cuadrado, la fecha límite para cubrir el costo total, el porcentaje mínimo requerido para pasar de reserva a ocupado, y las reglas de fecha y porcentaje de descuento por pronto pago. 
o	Nivel de importancia: Alta
3.	RF-03: Control de Ciclo de Vida y Transiciones de Estado
o	Descripción: El sistema debe gestionar las reglas de los estados de los stands:
	Disponible: Espacio libre para ser adquirido.
	Reservado: Espacio apartado por una editorial con un tiempo de vigencia definido (vigenciaReserva). 
	Ocupado: Estado que se adquiere al cubrir el porcentaje específico del costo. 
	Bloqueado: Espacio reservado internamente por el administrador antes del lanzamiento, el cual puede liberarse a DISPONIBLE o transferirse directamente a una editorial. 
o	Nivel de importancia: Alta
4.	RF-04: Gestión de Descuentos por Pronto Pago
o	Descripción: El sistema debe evaluar si la fecha actual se encuentra dentro del plazo límite de pronto pago (fechaProntoPago) para aplicar el beneficio económico correspondiente a la editorial. 
o	Nivel de importancia: Media
5.	RF-05: Sistema de Notificaciones Automáticas por Consola
o	Descripción: El sistema de notificaciones debe evaluar de forma automática las fechas actuales frente a los plazos establecidos para emitir alertas directas en la consola sobre:
	Reservas de stands a punto de vencer. 
	Plazos de pronto pago próximos a expirar. 
	Fechas límite para cubrir el costo total de los espacios. 
o	Nivel de importancia: Alta
6.	RF-06: Control de Datos de Editoriales / Clientes
o	Descripción: El sistema debe registrar la información de contacto de las editoriales (identificador, nombre y correo electrónico) y enlazarlas directamente con el stand que tienen asignado. 
o	Nivel de importancia: Alta
Requerimientos No Funcionales
1.	RNF-01: Ejecución en Interfaz de Línea de Comandos (CLI)
o	Descripción: La aplicación debe ejecutarse de manera eficiente y ligera directamente desde la terminal o consola de comandos de texto. 
o	Nivel de importancia: Alta
2.	RNF-02: Arquitectura Orientada a Objetos y Modularidad
o	Descripción: El código fuente debe estar estructurado mediante clases debidamente encapsuladas y separadas en paquetes lógicos independientes (como el paquete negocio y el paquete notificaciones). 
o	Nivel de importancia: Alta
3.	RNF-03: Persistencia Temporal en Memoria
o	Descripción: El sistema debe manejar la información de los objetos utilizando la memoria de ejecución de Java (y opcionalmente estructuras en memoria o bases de datos ligeras como H2 para pruebas rápidas). 
o	Nivel de importancia: Media



## 2. Diagrama de Clases
El sistema se compone de los siguientes paquetes y clases principales:
<img width="711" height="753" alt="diagrama de clase" src="https://github.com/user-attachments/assets/650123da-3fd2-47f5-90c6-3b1b34c7fd04" />
