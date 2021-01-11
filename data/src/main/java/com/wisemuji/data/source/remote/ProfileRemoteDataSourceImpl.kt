package com.wisemuji.data.source.remote

import com.wisemuji.data.entity.FollowersResponse
import com.wisemuji.data.entity.ProfileResponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class ProfileRemoteDataSourceImpl(
    private val service: ProfileRemoteService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO,
) : ProfileRemoteDataSource {

    override suspend fun fetchProfile(username: String): Result<ProfileResponse> =
        ioDispatcher.runCatching { service.fetchProfile(username) }

    override suspend fun fetchFollowers(username: String): Result<List<FollowersResponse>> =
        ioDispatcher.runCatching { service.fetchFollowers(username) }
}
