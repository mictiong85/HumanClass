package jp.techacademy.thion.maikeru.kotlinlog
import android.util.Log

open class Dog :Animal,Movable {

    //Constructor
    constructor(name:String,age:Int):super(name,age){

    }
    //method()
    override fun say(){
        Log.d("kotlintest",this.name+"("+this.age+"歳)"+"「ワンワン」")
    }
    override  fun move(){
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}