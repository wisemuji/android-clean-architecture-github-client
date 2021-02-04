package com.wisemuji.domain.dto

import com.wisemuji.data.entity.ProfileResponse

data class ProfileDto(
    val name: String?,
    val company: String?,
    val blog: String?,
    val location: String?,
    val bio: String?,
    val publicRepos: Int?,
    val publicGists: Int?,
    val followers: Int?,
    val following: Int?,
) {

    companion object {
        fun fromEntity(profileResponse: ProfileResponse) =
            ProfileDto(
                name = profileResponse.name,
                company = profileResponse.company,
                blog = profileResponse.blog,
                location = profileResponse.location,
                bio = profileResponse.bio,
                publicRepos = profileResponse.publicRepos,
                publicGists = profileResponse.publicGists,
                followers = profileResponse.followers,
                following = profileResponse.following,
            )
    }
}
