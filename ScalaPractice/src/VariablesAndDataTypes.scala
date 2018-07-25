

object VariablesAndDataTypes {

  def main(args: Array[String]) {
    VARexample
    VALexample
    IFELSEexample(-100)
    BooleanDataType(true)
  }

  def VARexample {
    var num = 100
    println("VAR Num Before Changing : " + num)
    num = 111
    println("VAR Num After Changing : " + num)
  }

  def VALexample {
    val num = 200
    println("\nVAL Num Before changing : " + num)

    // num = 201 // Shows error as val is immutable
  }

  def BooleanDataType(x:Boolean) {
    
    if (!x) {
      println("X is FALSE")
    }
    else
    {
      println("X is TRUE")
    }

  }

  def IFELSEexample(num: Int) {

    if (num <= 0) {
      println("\nNum is lesser than or equal to 0")
    } else if (num > 0 && num <= 5) {
      println("\nNum is greater than 0 and less than 5")
    } else if (num >= 5 && num <= 10) {
      println("\nNum is greater than 5 and less than or equal to 10")
    }

  }

}