package com.wisemuji.domain

import com.wisemuji.data.entity.FollowersResponse

data class FollowersDto(
    val username: String? = null,
) {

    companion object fun fromEntity(followersResponse: FollowersResponse) = FollowersDto(
        username = followersResponse.username
    )
}
