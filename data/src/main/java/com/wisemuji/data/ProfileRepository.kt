package com.wisemuji.data

import com.wisemuji.data.entity.FollowersResponse
import com.wisemuji.data.entity.ProfileResponse

interface ProfileRepository {

    suspend fun fetchProfile(username: String): Result<ProfileResponse>

    suspend fun fetchFollowers(username: String): Result<List<FollowersResponse>>
}
