# Laboratory3

Todos el codigo fue ejectutado en Java 

## Punto 1
Se implemento la interfaz TransportationStrategy la cual era implementada por las clases Bus, Taxi y Bici. Luego de eso se crea  la clase Context donde un campo es la interfaz TransportationStrategy. Luego, de acuerdo a la necesidad del usuario se le recomienda la estrategia mas optima para su viaje. 

## Punto 2

Se adicionaron las clases correspondientes a la franquicia de Medellin, y su implementación de cada tipo de pizza; adicionalmente se crearon ingredientes para agregar un nuevo tipo de pizza (Avocado Pizza) que ùnicamente es implementada en dicha franquicia. Esto se evidencia en los packages pizzafm y pizzaf 

## Punto 3

Se implemento la interfaz item la cual es implementadas por cada uno de los elementos necesarios para la cena, estos son Burger que a su vez es extendida por 3 tipos de hamburgesas diferentes, y ColdDrink que igualmente es extendida por 3 tipos de bebidas diferentes. Seguidamente, una clase mealBuilder, se utiliza para construir los tres menus de cena, agrupando varios items.

## Punto 4

The blob: Se creo una clase llamada Store que contiene listas de todos los objetos que vende la tienda (Shoes, Shirts, Jeans) y sus clientes (Customer). Las clases Shoes, Shirts, Jeans y Customer son objetos planos y la clase Store contiene listas para guardar todos los objetos. La clase Store contiene muchos metodos que deberian ir en las clases Shoes, Shirts, Jeans y Customer y por tanto es la clase "Blob"

Spaghetti: Se implementaron muchos condicionales consecutivos, con un flujo dificil de seguir y mal indentados. 

## Punto 5
Se implementaron decoradores Mocha, Milk, Figure_in_the_cover y CookTime ya que todos implementan la interfaz CondimentDecorator. La clase Simple es una tasa de caffe sencilla que hereda de la clase Beverage.  Usando la clase Simple y los decoradores se forman las clases Elementary, Sophisticated, Advanced. 


