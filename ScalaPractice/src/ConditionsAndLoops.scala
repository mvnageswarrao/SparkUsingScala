


import java.io.File

object scalaTutorial{

	def main(args:Array[String])
	{
	  var i = 10
		whileLoop(i)
	  primeNums
		
	}
	
	def whileLoop(i:Int)
	{
	  var i=0
	  while(i<=10)
		{
	  	print(i)
  		i+=1
		}
	}
	
	def primeNums(){
		val PrimeLst = List(1,2,3,4,5)
		for (i<-PrimeLst){
			if(i==11)
			{
				return
			}
				
			if(i!=1)
			{
				println(i)
			}
		}
	}
}
