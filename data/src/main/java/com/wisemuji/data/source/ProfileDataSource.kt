package com.wisemuji.data.source

import com.wisemuji.data.entity.FollowersResponse
import com.wisemuji.data.entity.ProfileResponse

interface ProfileDataSource {

    suspend fun fetchProfile(username: String): Result<ProfileResponse>

    suspend fun fetchFollowers(username: String): Result<List<FollowersResponse>>
}
