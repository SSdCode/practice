package programs

import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)

    print("Enter Number to check prime or not: ")
    val no = sc.nextInt()

    if(isPrime(no)){
        print("No is prime")
    }else {
        print("No is not prime")
    }

}

fun isPrime(no: Int): Boolean{
    if (no == 1)
        return false
    if (no == 2){
        return true
    }
    for(i in 2..no/2){
        if(no%i == 0){
            return false
        }
    }
    return true
}