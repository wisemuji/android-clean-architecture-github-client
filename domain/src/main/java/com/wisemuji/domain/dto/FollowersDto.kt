package com.wisemuji.domain.dto

import com.wisemuji.data.entity.FollowersResponse

data class FollowersDto(val username: String?) {

    companion object {
        fun fromEntity(followersResponse: FollowersResponse) =
            FollowersDto(username = followersResponse.username)
    }
}
