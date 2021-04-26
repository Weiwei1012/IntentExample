package com.example.intentexample

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//Parcelize 須在gradle加上一個 plugin: id 'kotlin-kapt'
@Parcelize
data class Person(val name: String, val age: Int): Parcelable