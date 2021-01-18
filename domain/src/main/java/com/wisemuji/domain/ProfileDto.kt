package com.wisemuji.domain

import com.wisemuji.data.entity.ProfileResponse

data class ProfileDto(
    val name: String? = null,
    val company: String? = null,
    val blog: String? = null,
    val location: String? = null,
    val bio: String? = null,
    val publicRepos: Int? = null,
    val publicGists: Int? = null,
    val followers: Int? = null,
    val following: Int? = null,
) {

    companion object {
        fun fromEntity(profileResponse: ProfileResponse) = ProfileDto(
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
