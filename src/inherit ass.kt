fun main() {
var compare=Car("Toyota","Camry","black",9)
    compare.carry(9)
    compare.carry(11)
    compare.identity()
    println(compare.calculateParkingFees(12))
var mum=Bus("Toyota","Camry","black",10)
   println(mum.maxTripFare(2.3))
    println(mum.calculateParkingFees())



}
open class Car(var make:String,var model:String,var color:String,var capacity:Int){

    fun carry(people:Int){
        var x=people-capacity
        if (people<=capacity) {
            println("Carrying $people passengers")
           }
        else{
println("Over capacity $people")
        }
    }
    fun identity(){
        var color="black"
        var make ="Toyota"
        var model="Camry"
        println("I am $color $make $model")
    }
fun calculateParkingFees(hours:Int):Int{
  var packingfees=hours*20
    return packingfees

}

}
 class Bus( make:String, model:String, color:String, capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(Fare:Double):Double{
        return Fare

    }
    fun calculateParkingFees():Int{
        return capacity+10
    }


}