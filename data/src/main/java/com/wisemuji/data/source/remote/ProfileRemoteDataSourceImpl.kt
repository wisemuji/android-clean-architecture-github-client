package com.wisemuji.data.source.remote

import com.wisemuji.data.entity.FollowersResponse
import com.wisemuji.data.entity.ProfileResponse

class ProfileRemoteDataSourceImpl(
    private val service: ProfileRemoteService,
) : ProfileRemoteDataSource {

    override suspend fun fetchProfile(username: String): ProfileResponse =
        service.fetchProfile(username)

    override suspend fun fetchFollowers(username: String): List<FollowersResponse> =
        service.fetchFollowers(username)
}
