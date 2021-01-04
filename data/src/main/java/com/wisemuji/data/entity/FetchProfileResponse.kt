package com.wisemuji.data.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FetchProfileResponse(
    @Json(name = "name") val name: String? = null,
    @Json(name = "company") val company: String? = null,
    @Json(name = "blog") val blog: String? = null,
    @Json(name = "location") val location: String? = null,
    @Json(name = "bio") val bio: String? = null,
    @Json(name = "public_repos") val public_repos: Int? = null,
    @Json(name = "public_gists") val public_gists: Int? = null,
    @Json(name = "followers") val followers: Int? = null,
    @Json(name = "following") val following: Int? = null,
)
