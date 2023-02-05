package com.example.starwarstest.ui.core

import com.google.gson.Gson

interface Serialization {
    fun toString(obj: Any): String
    fun <T : Any> toObj(source: String, clasz: Class<T>): T

    class Base(private val gson: Gson) : Serialization {

        override fun toString(obj: Any): String = gson.toJson(obj)

        override fun <T : Any> toObj(source: String, clasz: Class<T>): T {
            return gson.fromJson(source, clasz)
        }
    }

}