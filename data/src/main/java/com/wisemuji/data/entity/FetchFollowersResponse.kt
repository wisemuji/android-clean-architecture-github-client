package com.wisemuji.data.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FetchFollowersResponse(
    @Json(name = "login") val username: String? = null,
)
