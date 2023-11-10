import java.util.Random

object Sample2 {
  def foo(): Int =
    (new Random).nextInt(10)  // insecure randomness
}
