/** Напишите отдельные функции, решающие поставленную задачу.
 *
 * Синтаксис:
 *   // метод
 *   def myFunction(param0: Int, param1: String): Double = // тело
 *
 *   // значение
 *   val myFunction: (Int, String) => Double (param0, param1) => // тело
 */
object Functions extends App {

  /* a) Напишите функцию, которая рассчитывает площадь окружности
   *    r^2 * Math.PI
   */
def сircle(r: Double): Double = r*r*Math.PI


  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testCircle(r: Double): Double = сircle(r)



  /* b) Напишите карированную функцию которая рассчитывает площадь прямоугольника a * b.
   */

  def res(a: Double)=(b: Double) => a*b


  // примените вашу функцию из пукта (b) здесь, не изменяя сигнатуру
  def res2(a: Double, b: Double): Double = res(a)(b)


  // c) Напишите не карированную функцию для расчета площади прямоугольника.

  def res3(a: Double, b: Double): Double = a*b|

  // примените вашу функцию из пункта (c) здесь, не изменяя сигнатуру
  def test(a: Double, b: Double): Double = res3(a,b)

  println("Тест площади круга: " + testCircle(5))
  println("Тест карированной площади прямоугольника: " + res2(5,10))
  println("Тест не карированной площади прямоугольника: " + test(5,10))
}
