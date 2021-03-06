package jp.techacademy.thion.maikeru.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val human1=Human("Michael",35,"食事")
        human1.say()
        human1.think()


        val human2=Human("Tony",33,"車")
        human2.say()
        human2.think()
    }
    private fun total(first:Int,last:Int): Int {
        var sum=0
        for(i in first..last){
            sum+=i
        }
        return sum
    }
}