package jp.techacademy.thion.maikeru.kotlinlog

import android.util.Log

class Human:Animal,Thinkable {
    constructor(name: String,age:Int) : super(name,age) {
    }

    override fun say(){
        Log.d("kotlintest","私の名前は"+this.name+"です。年は"+this.age+"歳です。")
    }

    override fun think(hobby:String) {
        Log.d("kotlintest","私は"+hobby+"について考える。")
    }

}