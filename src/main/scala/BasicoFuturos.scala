import scala.concurrent.Future

object BasicoFuturos {

  /**
    * Imprimir el resultado de un futuro al hacer callback del mismo
    * revisar documentación de:
    *
    *  onComplete
    *  onSuccess
    *  onFailure
    *
    * Implementar el callback con estos 3 metodos
    * @param ft
    * @return
    */
  def callbackFuture(ft: Future[String]) = ???

  /**
    * Imprimir en secuencia unos futuros que son lanzados en la función
    *
    * Revisar funciones:
    *   map -> no garantiza orden... revisar porqué
    *   flatMap
    *   for comprehension
    *
    *  implementar todas las soluciones
    */
  def secuencializarFuturos() = {
    val a1: Future[Int] = Future {1}
    val a2: Future[Int] = Future {2}
    val a3: Future[Int] = Future {3}

    //Imprimir a serie de futuros en orden

  }

  /**
    * Recibe una lista de Futuros de enteros. Desenvolver los futuros adecuadamante para
    * realizar la suma de los elementos de esa lista
    *
    * Revisar:
    *  sequence
    *
    * @param fl
    * @return
    */
  def listaDeFuturos(fl: List[Future[Int]]) = ???

  /**
    * Al dividir por 0 el futuro lanzara una excepción que de alguna forma tendra que capturar
    * una forma es recuperarse y devolve otro valor al esperado al momento de ocurrir la excepción
    *
    * usar la función recover para que cuando se divida por 0 cuaquier número
    * el resultado sea 0
    */
  def dividirPor0Recover(x: Int) = {
    val i = Future {
      x / 0
    }
  }

  /**
    * Al dividir por 0 el futuro lanzara una excepción que de alguna forma tendra que capturar
    * una forma es recuperarse y devolve otro valor al esperado al momento de ocurrir la excepción
    *
    * usar la función recoverWith para que cuando se divida por 0 cuaquier número
    * el resultado sea un nuevo futuro con un error diferente a ArithmeticException
    */
  def dividirPor0RecoverWith(x: Int) = {

    val i = Future {
      x / 0
    }
  }
}
