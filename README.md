# 🛡️ MACHETE TEÓRICO: COMPLETAR LA FRASE (Exámenes 2024)

Este es el solucionario exacto de las preguntas de teoría que están al final de tu PDF. Leé la explicación en criollo para que te quede la lógica guardada.

---

### BLOQUE 1: Tipos de Datos y Memoria 📦

**1. "La _________ es la conversión de tipos que realizan los traductores cuando falla un type checking."**
* **Respuesta que va en el blanco:** `Coerción (o Coerción Implícita)`.
* *En criollo:* Es lo que hace JavaScript cuando multiplicás `"10" * 5` y te da `50`. Como los tipos no coinciden (texto vs número), el lenguaje lo convierte por atrás para salvarte las papas.

**2. "El tipo de datos de un objeto de datos define su _________."**
* **Respuesta que va en el blanco:** `Dominio de valores y el conjunto de operaciones permitidas`.
* *En criollo:* Si declarás algo como `int`, la compu ya sabe que solo puede guardar números enteros (dominio) y que se puede sumar, restar, etc. (operaciones). No le vas a poder guardar una letra ni pedirle que la pase a mayúsculas.

**3. "Un lenguaje que no permite violaciones a las reglas de tipo es un lenguaje _________."**
* **Respuesta que va en el blanco:** `Fuertemente tipado`.
* *En criollo:* Nuestro amigo C++. El policía estricto. Si tratás de meter un puntero `int` en un puntero `double`, te tira error y no compila.

**4. "Un operador que se vincula a distintas operaciones de acuerdo a los operandos que recibe es un operador _________."**
* **Respuesta que va en el blanco:** `Sobrecargado`.
* *En criollo:* Pensá en el signo más (`+`). Si le das dos números (`2 + 2`), suma y da 4. Si le das dos textos (`"Hola" + "Adriel"`), los pega y da "HolaAdriel". Tiene múltiples trabajos.

**5. "Mencionar las 3 características de los arreglos estáticos:"**
* **Respuestas:** `1) Tamaño fijo (no cambian). 2) Homogéneos (todos los elementos son del mismo tipo). 3) Se ubican en posiciones de memoria contiguas.`

---

### BLOQUE 2: Alcance y Analizadores (Parsers) 🏭

**6. "Si la referencia al contexto de una subrutina, apunta al registro de la subrutina que la contiene, se aplica acceso de _________."**
* **Respuesta que va en el blanco:** `Alcance Estático (o Léxico)`.
* *En criollo:* Es el "truco de mirar para afuera" que hicimos ayer. Si una función no tiene una variable adentro de sus llaves, mira el código fuente y busca en la función que la "envuelve".

**7. "El árbol sintáctico es generado por _________."**
* **Respuesta que va en el blanco:** `El Analizador Sintáctico (o Parser)`.
* *En criollo:* El Scanner (léxico) junta las letras y arma las palabras. El Parser (sintáctico) agarra esas palabras y arma el árbol para ver si la oración tiene sentido lógico.

**8. "Analizador sintáctico LL(1) genera un análisis recursivo _________."**
* **Respuesta que va en el blanco:** `Descendente`.
* *En criollo:* Acordate de esto: **LL = Descendente** (arranca desde la raíz S y baja hacia las letras). **LR = Ascendente** (arranca desde las letras y sube a la raíz).

---

### BLOQUE 3: Jerarquía de Chomsky y Autómatas 🤖
*(Esta es matemática pura, aprendete estas parejas de memoria porque siempre entran)*

**9. "Una gramática regular genera un lenguaje _________."**
* **Respuesta:** `Regular (o Tipo 3)`.

**10. "Los lenguajes dependientes del contexto pueden ser reconocidos por _________."**
* **Respuesta:** `Autómatas Linealmente Acotados`.

**11. "Para todo autómata finito no determinista es posible hallar un _________ equivalente."**
* **Respuesta:** `Autómata Finito Determinista (AFD)`.
* *En criollo:* Por más caótico y lleno de caminos que sea un AFND, siempre existe un método matemático para convertirlo en un autómata ordenadito y sin ambigüedades.

**12. "Una máquina de Turing puede reconocer _________."**
* **Respuesta:** `Lenguajes Recursivamente Enumerables (o Tipo 0)`.
* *En criollo:* La máquina de Turing es el "dios" de los autómatas, reconoce absolutamente todo lo que se pueda programar.
```
