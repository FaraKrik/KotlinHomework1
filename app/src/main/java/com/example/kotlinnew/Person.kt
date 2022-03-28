package com.example.kotlinnew

import kotlin.math.abs

val globalField = "Hello"
private val externalfield = "hello"



class Person(private val firstName: String, val lastName: String, var age: Int) {

    var someVal: Int = 0
    get() {
        return age + 10
    }

    set(value) {
        field = value - 5
    }

    init {
        someMethod()
    }

    val someField = 10L
    val someField2: Long = 10
    var someField3: String? = ""

    val arrayList = ArrayList<String>()
    var arrayList2 = arrayListOf<String>("asik","asus")
    val array = arrayOf(1, 4, 5)
    val array2 = arrayOfNulls<Int>(5)
    val array3 = Array(5) {0}


    var field2: Person? = null
    lateinit var field3: Person





    fun someMethod(): Unit {
        print(firstName)

        print(someVal)

        for (item in arrayList2) {
            print(item)
        }

        arrayList2.forEach {
            print(it) // печается все сразу
        }
        arrayList2.forEach {string ->
            print(string)   // каждая строчка печатывается отдельно
        }

        for (i in 1..10) {
            print(i.toString())
        }

        for (i in 1 until 10) {
            print(i.toString()) // от 1 до 9
        }

        for (i in 10 downTo 1 step 2) {
            print(i.toString())
        }

        for(i in arrayList2.indices) {
            print(i.toString())
        }

        printStrings(2, "adaf")

        val value = arrayList2[0]

        val result = if (field2 != null) {
            "nonNull"
        } else {
            null
        }

        field2 = Person("ssd", "sdad", 100)
        field3 = Person("ssd", "sdad", 100)

        field3.array

        globalField
        externalfield


        val length = someField3?.subSequence(0, 2)?.length
        //val length = someField3!!.length

        val data1 = SomeDataClass(1,2.0)
        val data2 = SomeDataClass(1, 3.0)

        if (data1 == data2) {
            val data3 = data2.copy(b = 5.0)
        }
        doSomething(10,20.0, "abc", 2f, WeatherType.CLOUDY)
        doSomething(10,20.0, d = 30f)



    }



    fun getSomeInt(): Int {
        return abs(50)
    }

    fun getSomeDouble() = 20.0

    fun printStrings(data: Int, vararg string: String) {
        val string = string[0]
    }

    fun doSomething(a: Int, b: Double, c: String = "Hello", d: Float, enum:WeatherType = WeatherType.SUNNY) {

        when(enum) {
            WeatherType.SUNNY -> {
                print("asdasd")
            }
            WeatherType.RAINY, WeatherType.CLOUDY -> {
                print("asda2323sd")
            }

            WeatherType.MISTY -> {
                print("asdajkjkhjsd")
            }
            else -> {
                print("Unknow data!")
            }

        }

    }

}