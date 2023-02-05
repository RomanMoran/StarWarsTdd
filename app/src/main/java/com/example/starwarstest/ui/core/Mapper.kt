package com.example.starwarstest.ui.core

/**
 * @author Asatryan on 24.04.2022
 */
interface Mapper<R, S> {

    fun map(source: S): R

    interface Unit<S> : Mapper<kotlin.Unit, S>
}