package vn.edu.vlsc.lab3a.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// Time complexity khởi tạo: O(1)
@Parcelize
data class Student(
    val id: Int,
    val name: String,
    val mssv: String,
    val avatarRes: Int
) : Parcelable
