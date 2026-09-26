// Ho va ten: Ho Thanh Tinh - MSSV: 25810044
//  Bai 01: Xep hang ve xem phim theo do tuoi
package com.example.ltdd.buoi03

fun main() {
    val tuoi = 15

    val loaiVe = if (tuoi < 12) {
        "Ve tre em"
    } else if (tuoi in 12..59) {
        "Ve nguoi lon"
    } else {
        "Ve cao tuoi"
    }

    println("Tuoi: $tuoi -> Loai ve: $loaiVe")
}
