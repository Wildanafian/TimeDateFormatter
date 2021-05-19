package com.wldn.timedateformatter

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

/**
Created by Wildan Nafian on 28 April 2021
Contact me on  Wildanafian8@spesolution.com
 **/


/**
Date Formater

@inputDate = the date you want to convert
@currentDatePattern = the date pattern you want to convert
@outputDatePattern = the desired date output format
@number = amount of date you want to jump *from current date*

ex :
-inputDate = 12 04 2021
-currentDatePattern = dd MM yyyy
-outputDatePattern = dd/MM/yyyy
@result = 12/04/2021

-inputDate = 12 04 2021
-number = 2
@result = 10/04/2021

NOTE : Any errors will throw empty string
 **/

@SuppressLint("SimpleDateFormat")
fun getCurrentDate(): String = doMagic("dd MM yyyy", Calendar.getInstance().time)

fun getCurrentDate(outputDatePattern: String): String {
    return doMagic(outputDatePattern, Calendar.getInstance().time)
}

fun getDateBeforeCurrentDate(number: Int): String {
    return doMagic("dd MM yyyy", doMagicCalendar(-number))
}

fun getDateAfterCurrentDate(number: Int): String {
    return doMagic("dd MM yyyy", doMagicCalendar(number))
}

fun getDateBeforeCurrentDate(outputDatePattern: String, number: Int): String {
    return doMagic(outputDatePattern, doMagicCalendar(-number))
}

fun getDateAfterCurrentDate(outputDatePattern: String, number: Int): String {
    return doMagic(outputDatePattern, doMagicCalendar(number))
}

/////////////////

fun formatDate(inputDate: String?): String {
    return doMagic("dd MM yyyy", inputDate)
}

fun formatDate(inputDate: Date): String {
    return doMagic("dd MM yyyy", inputDate)
}

fun formatDate(currentDatePattern: String, outputDatePattern: String, inputDate: String): String {
    return doMagic(outputDatePattern, SimpleDateFormat(currentDatePattern, Locale("id", "ID")).parse(inputDate)!!)
}


fun doMagic(pattern: String, inputDate: String?): String {
    return try {
        SimpleDateFormat(pattern, Locale("id", "ID")).format(inputDate)
    } catch (e: Exception) {
        ""
    }
}

fun doMagic(pattern: String, inputDate: Date): String {
    return try {
        SimpleDateFormat(pattern, Locale("id", "ID")).format(inputDate)
    } catch (e: Exception) {
        ""
    }
}

private fun doMagicCalendar(number: Int): Date {
    val c = Calendar.getInstance()
    c.add(Calendar.DATE, number)
    return c.time
}