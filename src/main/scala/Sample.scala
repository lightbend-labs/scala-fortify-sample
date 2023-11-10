import sys.process._

object Sample {
  def main(args: Array[String]): Unit =
    args(0).!  // command injection vulnerability
}
