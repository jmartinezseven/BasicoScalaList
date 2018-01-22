object BasicoListas {

  /**
    * Recibir una lista de elementos enteros y devolver el mayor
    *
    * Pista: Solucion recursiva es una buena opcion
    * @param lista
    * @return
    */
  def maximoDeUnaLista(lista: List[Int]): Int = ???

  /**
    * Realizar la suma de todos los elementos de una lista
    *
    * Pista: Ver functiones fold, foldLeft, foldRight
    *
    * Usar una solucion con las funciones anteriores y hacer una solucion recursiva
    * @param lista
    * @return
    */
  def sumaElementosLista(lista: List[Int]): Int = ???

  /**
    * Toma una lista y devuelve otra lista cuyos valores son el doble de la anterior
    * EJ: List(1,2,3) el resultado debe ser List(2,4,6)
    *
    * Pista: Ver function map
    *
    * Usar una solucion con las funciones anteriores y hacer una solucion recursiva
    * @param lista
    * @return
    */
  def multiplicarElementosLista(lista: List[Int]): List[Int] = ???

  /**
    * Devolver verdadero o falso si existe un elemento o no en la lista
    * Hacer solucion iterativa, recursiva.
    * Existe en scala una funcion para hacer esto en una linea. Investigar
    *
    * @param lista
    * @param n Elemento a encontrar
    * @return
    */
  def existeUnElementoLista(lista: List[Int], n: Int): Boolean = ???

}
