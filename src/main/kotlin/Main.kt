fun main(){
    charInString("akirachix")
    println(intro("Faith", 30))
    println(stringLength("Laikipia"))
    identity("Faith")
    println(isEven(60))
    println(extract("akirachix is awesome"))
    temperature(37.7)
    records("Faith",21,"0711303757",55.5F,"Kenyan")

}
//QUESTION 1
fun charInString(school: String){
    println(school[0]+" "+school[2]+" "+school[3])

}

//QUESTION 2
fun intro(name:String, age:Int): String{
    var result = "Hi, my name is $name and I am $age years old"
    return result

}

//QUESTION 3
fun stringLength(name1: String): Int{
    var res = name1.length
    return res

}

//QUESTION 4
fun identity(name2: String){
    if(name2=="Faith"){
        println("That's me!")
    }
        else{
            println("I do not know who that is")
    }

}

//QUESTION 5
fun records(full_name: String, age: Int, phone_no: String, weight: Float, citizen: String){
    println("$full_name $age $phone_no $weight $citizen")
}

//QUESTION 6
fun isEven(num4: Int): Boolean{
    var num5 = num4 % 2== 0
    return num5

}

//QUESTION 7
fun extract(sentence: String): String{
    var resu = sentence.slice(2..5)
    return resu

}

//QUESTION 8
fun temperature(temp: Double){
     println("The temperature is $temp degrees Celsius")

}

