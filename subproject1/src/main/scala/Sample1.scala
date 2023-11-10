import sys.process._

object Sample1 {
  def main(args: Array[String]): Unit =
    args(0).!  // command injection vulnerability
}
