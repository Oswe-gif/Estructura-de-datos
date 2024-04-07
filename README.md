# Listas enlazadas
"En ciencias de la computación, una lista enlazada es una de las estructuras de datos fundamentales, y puede ser usada para implementar otras estructuras de datos." [[1]](https://pages.github.com/](https://www.deltapci.com/java-listas-enlazadas-simples/)https://www.deltapci.com/java-listas-enlazadas-simples/)  
Los nodos son los elementos que se almacenan; cada nodo tiene su propio puntero. Dicho puntero señala al nodo siguiente.  
Para acceder a los elementos de la lista, debo acceder a la cabeza y empezar a recorrer nodo por nodo de acuerdo con su puntero (ver Figura 1). En conclusión, una lista es un conjunto de nodos apuntados entre sí.    

**Figura 1:**      
![image](https://github.com/Oswe-gif/Estructura-de-datos/assets/84868357/58211191-1c9c-4cd8-ba50-f41cd85fb39c)  
Tomada de: https://www.youtube.com/watch?v=0NzAFk1CwaQ&list=PLTd5ehIj0goMTSK7RRAPBF4wP-Nj5DRvT&index=2&ab_channel=makigas  

El ultimo elemento apunta a un nodo vacio (null). (ver figura 2)   

**Figura 2:**    
![image](https://github.com/Oswe-gif/Estructura-de-datos/assets/84868357/d7687b3b-80cc-486b-ae52-c1143cd819d5)  
Tomada de: https://www.youtube.com/watch?v=0NzAFk1CwaQ&list=PLTd5ehIj0goMTSK7RRAPBF4wP-Nj5DRvT&index=2&ab_channel=makigas  

*Ventajas de usar nodos en lugar de arrays en Java [[2]](https://www.youtube.com/watch?v=0NzAFk1CwaQ&list=PLTd5ehIj0goMTSK7RRAPBF4wP-Nj5DRvT&index=2&ab_channel=makigas):*      
- Los nodos no tienen que guardarse todos juntos en memoria como los arrays.
- Puede tener longitud variable.
- Podemos agregar y quitar elementos en tiempos de ejecución.

*Desventajas de usar nodos en lugar de arrays en Java [[2]](https://www.youtube.com/watch?v=0NzAFk1CwaQ&list=PLTd5ehIj0goMTSK7RRAPBF4wP-Nj5DRvT&index=2&ab_channel=makigas):*    
- Las listas no tienen un índicie, no podemos acceder de manera aleatoria.
- Se necesita más espacios en memoria porque deben de almacenar indices.

Para recorrer los elementos, por lo general, se realiza un ciclo que comienza en la cabeza y avanza al siguiente elemento utilizando su puntero, repitiendo este proceso sucesivamente con los demás nodos. 
Al final de la lista, se encuentra un elemento nulo que indica que se ha recorrido toda la lista.  
Podemos insertar o eliminar elementos en una lista al inicio, al final o en cualquier parte de esta. Pero se deben modificar los punteros cada vez que se realiza la operación de inserción (ver Figura 3).  

**Figura 3:**   
![image](https://github.com/Oswe-gif/Estructura-de-datos/assets/84868357/523b2ea5-b31f-47c2-8f64-0201465dad0d)  
Tomada de: https://www.youtube.com/watch?v=0NzAFk1CwaQ&list=PLTd5ehIj0goMTSK7RRAPBF4wP-Nj5DRvT&index=2&ab_channel=makigas  

**Más información**  
En el video aprenderás sobre la teoría de las listas enlazadas y cuáles son sus ventajas y desventajas. También recomiendo leer los comentarios del video, ya que hay toda una comunidad hablando de este tipo de datos.

[![image](https://github.com/Oswe-gif/Estructura-de-datos/assets/84868357/ce1d41a3-dbe0-4546-8e5e-57738b431c11)](https://www.youtube.com/watch?v=34ky600VTN0)  

