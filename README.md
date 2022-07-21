## Ejemplo De Clase Abstracta 

- Las clases abstractas tienen la característica especial de que pueden coexistir constructores, métodos y atributos de una clase regular con la definición de métodos abstractos sin ningún tipo de implementación. Por otro lado las clases abstractas solo sirven como clases base o superclases dentro de la herencia, por lo tanto no se pueden crear objetos o instancias de dichas clases. En el lenguaje Java, para definir que una clase es abstracta se coloca la palabra reservada abstract antes del nombre de la clase. En cuanto a la definición de los métodos abstractos, los mismos también deben utilizar la palabra abstract antes de cada uno de sus nombres. La herencia se utiliza normalmente para la reutilización de código de las superclases en la clases derivadas, pero otro uso muy importante dentro de la Programación Orientada a Objetos es la reutilización de conceptos o la sobreescritura de los métodos definidos en las clases bases, por lo tanto si a las clases base no se las va a utilizar directamente creando instancias, sino como un concepto que ayude a las clases derivadas, entonces ahí conviene definir a las clases base como abstractas. Para representar una clase abstracta en UML, la única diferencia con las clases regulares es que el nombre de la clase se debe escribir en cursiva.

- A su vez, las clases abstractas suelen contener métodos abstractos: la situación es la misma. Para que
un método se considere abstracto ha de incluir en su signatura la palabra clave abstract. Además un
método abstracto tiene estas peculiaridades:

1. No tiene cuerpo (llaves): sólo consta de signatura con paréntesis.

2. Su signatura termina con un punto y coma.

3. Sólo puede existir dentro de una clase abstracta. De esta forma se evita que haya métodos
que no se puedan ejecutar dentro de clases concretas. Visto de otra manera, si una clase
incluye un método abstracto, forzosamente la clase será una clase abstracta

4. Los métodos abstractos forzosamente habrán de estar sobreescritos en las subclases. Si una
subclase no implementa un método abstracto de la superclase tiene un método no ejecutable,
lo que la fuerza a ser una subclase abstracta. Para que la subclase sea concreta habrá de
implementar métodos sobreescritos para todos los métodos abstractos de sus superclases. 

