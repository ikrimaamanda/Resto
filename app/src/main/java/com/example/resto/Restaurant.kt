package com.example.resto

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Story {

    var restoName = ""
    @RequiresApi(Build.VERSION_CODES.O)
    val dateTime = LocalDateTime.now()
    @RequiresApi(Build.VERSION_CODES.O)
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    @RequiresApi(Build.VERSION_CODES.O)
    val formatted = dateTime.format(formatter)
    var cashierName = ""
    var item:MutableList<String> = mutableListOf<String>()
    var price:MutableList<Int> = mutableListOf<Int>()
    companion object
    {
        @JvmStatic
        fun main(args:Array<String>){
            var s = Story()
            println("==============================")
            println("Input Program")
            print("Resto Name : ")
            s.restoName = readLine().toString()
            print("Cashier Name : ")
            s.cashierName = readLine().toString()
            do {
                print("Input Item : ")
                var inputItem = readLine().toString()
                print("Input Price : ")
                var inputPrice = readLine().toString()
                s.item.add(inputItem)
                s.price.add(inputPrice.toInt())
                print("Order again? (yes/no) ")
                var order = readLine().toString()
            } while (order.equals("yes", true))

            println("==============================")
            println()

            println("Output Program")
            s.nameResto(s.restoName)
            println("Tanggal :  ${s.formatted}")
            print("Nama Kasir : ")
            s.nameCashier()
            println("==============================")
            s.order()
        }}

    fun nameResto(name:String){
        if(name.length > 30) {
            println(name.subSequence(0, 30))
            println(name.subSequence(30, name.length))
        }
        else {
            var length = (30 - name.length) / 2
            for (i in 0 until length+1) {
                print(" ")
            }
            println(name)
        }
    }

    fun nameCashier(){
        if (cashierName.length >= 17) {
            println(cashierName.subSequence(0, 17))
            println(cashierName.subSequence(17, cashierName.length))
        }
        else {
            for (i in 0 until 17-cashierName.length) {
                print(" ")
            }
            println(cashierName)
        }
    }

    fun order() {
        var total = 0
        var length = item.size
        for (i in 0 until length) {
            total += price[i]
            val x = 30 - (item[i].length + price[i].toString().length + 2)
            print(item[i])
            for (j in 0 until x) {
                print(".")
            }
            print("Rp")
            println(price[i])
        }
        println()
        print("Total")
        val x = 30 - (7 + total.toString().length)
        for (i in 0 until x) {
            print(".")
        }
        println("Rp" + total)
    }
}