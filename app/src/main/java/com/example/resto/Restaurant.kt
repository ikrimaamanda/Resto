package com.example.resto

class Restaurant {

    val menu = arrayOf("Nasi", "Lauk", "Minum")
    val price = arrayOf(5000, 10000, 5000)
    lateinit var answer : String
    var listOrder : MutableList<Int> = mutableListOf<Int>()
    var order = 0

    fun addDot(x : Int) {
        for (i in 0 until x) {
            print(".")

        }
    }
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val resto = Restaurant()
            var checkOrder = false

            println("========Menu========")
            for (i in 0 until resto.menu.size) {
                println("${i+1}. ${resto.menu[i]}.....Rp${resto.price[i]}")
            }
            println()
            print("Ingin memesan? (Y/N) : ")
            resto.answer = readLine().toString()

            while (checkOrder == false) {
                if (resto.answer == "Y") {
                    print("masukkan pesanan anda :")
                    resto.order = readLine()!!.toInt()
                    resto.listOrder.add(resto.order)
                    checkOrder = true
                } else {
                    checkOrder = true
                }
            }

            println()
            println("Warung Makan Sederhana \nTanggal : 2020/12/03 15:00:00")
            println("Nama Kasir : \tIkrima")
            for (i in 0 until 30) {
                print("=")
            }

        }
    }
}