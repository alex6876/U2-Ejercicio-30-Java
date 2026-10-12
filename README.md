# 🎬 Simulación de Plataforma de Streaming y Contenido Digital (POO y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de reproducción multimedia compuesto por diferentes tipos de contenidos digitales (Películas, Episodios de Series y Transmisiones en Vivo). Pone en práctica conceptos avanzados de la **Programación Orientada a Objetos (POO)** como **clases abstractas**, **herencia de atributos protegidos**, **sobreescritura de métodos (`@Override`)** y **polimorfismo** mediante colecciones en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una superclase abstracta que define la plantilla base y múltiples implementaciones especializadas:

*   **`ContenidoDigital` (Clase Abstracta)**: Define los atributos y el comportamiento contractual común para cualquier medio de reproducción.
    *   **Atributos protegidos (`protected`)**: `titulo` y `duracionMinutos`, accesibles directamente por las subclases.
    *   **Método abstracto**: `reproducir()`, que obliga a cada tipo de contenido a implementar su propia lógica de ejecución.
*   **`Pelicula`**: Modela un largometraje cinematográfico.
    *   **Comportamiento:** Valida que la duración en minutos sea mayor a cero antes de iniciar la reproducción.
*   **`EpisodioSerie`**: Modela un capítulo específico dentro de una serie de televisión.
    *   **Atributos específicos:** `nombreSerie` y `numeroEpisodio`.
    *   **Comportamiento:** Valida tanto la duración como el número de episodio antes de mostrar el desglose informativo por consola.
*   **`TransmisionEnVivo`**: Modela eventos en tiempo real (streaming).
    *   **Atributos específicos:** `enCurso` (bandera booleana).
    *   **Comportamiento:** Evalúa si la transmisión está activa para permitir la conexión o rechazar la reproducción si el evento finalizó o aún no comienza.
*   **`Main`**: Punto de entrada del programa. Agrupa instancias heterogéneas en una lista polimórfica (`List<ContenidoDigital>`) y ejecuta un bucle de reproducción unificado.

---

## ⚙️ Conceptos Clave de POO Aplicados

1. **Abstracción y Jerarquía:** La superclase `ContenidoDigital` centraliza los datos comunes de cualquier archivo o medio multimedia, delegando en las hijas la forma en que deben reproducirse.
2. **Polimorfismo en Colecciones:** El uso de una lista tipada con la clase abstracta (`List<ContenidoDigital>`) permite almacenar objetos de clases totalmente distintas (`Pelicula`, `EpisodioSerie`, `TransmisionEnVivo`) y procesarlos de manera idéntica mediante el método `reproducir()`.
3. **Visibilidad Protegida (`protected`):** Permite que las subclases accedan directamente a los atributos `titulo` y `duracionMinutos` definidos en la clase padre sin necesidad de duplicar código ni exponerlos públicamente.
4. **Validaciones Condicionales por Tipo de Contenido:** Cada clase concreta implementa reglas de negocio propias (ej. verificar si una transmisión en vivo está activa frente a validar la duración de una película).

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Reproduciendo pelicula: El Conjuro
Duracion: 112 minutos
La pelicula ha comenzado.
-----------------------------
Reproduciendo episodio: El comienzo
Serie: Serie Misteriosa
Episodio numero: 1
Duracion: 45 minutos
-----------------------------
No se puede reproducir Concierto en directo
La transmision no esta en curso.
-----------------------------
No se puede reproducir Partido de futbol
La transmision no esta en curso.
-----------------------------
