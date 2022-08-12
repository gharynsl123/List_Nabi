package com.example.listnabi

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class NabiList(
    var nameEx : String,
): Parcelable