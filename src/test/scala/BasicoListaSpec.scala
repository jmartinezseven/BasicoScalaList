import org.scalatest.WordSpec

class BasicoListaSpec extends WordSpec {

  "BasicoListas" should {
    "devolver el maximo de una lista de enteros" in {
      val list = List(2,4,6,78,3,5,89)

      val result = BasicoListas.maximoDeUnaLista(list)

      assert(result === 89)
    }

    "dar la suma de los elementos de una lista de enteros" in {
      val list = List(1,2,3,4,5)

      val result = BasicoListas.sumaElementosLista(list)

      assert(result === 15)
    }

    "transformar una lista de enteros al doble" in {
      val list = List(1,2,3,4)

      val result = BasicoListas.multiplicarElementosLista(list)

      assert(result === List(2,4,6,8))
    }

    "Existe un elemento en una lista" in {
      val list = List(1,2,3,4)
      val n = 1

      val result = BasicoListas.existeUnElementoLista(list, n)

      assert(result === true)
    }
  }
}
