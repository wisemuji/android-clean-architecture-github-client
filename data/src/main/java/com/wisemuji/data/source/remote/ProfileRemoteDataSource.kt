package com.wisemuji.data.source.remote

import com.wisemuji.data.entity.FollowersResponse
import com.wisemuji.data.entity.ProfileResponse

interface ProfileRemoteDataSource {

    suspend fun fetchProfile(username: String): Result<ProfileResponse>

    suspend fun fetchFollowers(username: String): Result<List<FollowersResponse>>
}
