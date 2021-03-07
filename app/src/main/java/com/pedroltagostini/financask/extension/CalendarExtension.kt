package com.pedroltagostini.financask.extension

import java.text.SimpleDateFormat
import java.util.Calendar

fun Calendar.formataParaBrasileiro(): String{
    val formatoBrasileiro = "dd/MM/yyyy"
    val formato = SimpleDateFormat(formatoBrasileiro)
    return formato.format(this.time)

}