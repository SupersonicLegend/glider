package org.supersoniclegend.glider.api.photos.getInfo

import com.google.gson.annotations.SerializedName

data class Comments(
    @SerializedName("_content") val count: String
)
