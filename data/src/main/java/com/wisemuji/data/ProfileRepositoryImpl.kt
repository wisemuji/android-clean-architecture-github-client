package com.wisemuji.data

import com.wisemuji.data.entity.FollowersResponse
import com.wisemuji.data.entity.ProfileResponse
import com.wisemuji.data.source.remote.ProfileRemoteDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class ProfileRepositoryImpl @Inject constructor(
    private val remoteDataSource: ProfileRemoteDataSource,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO,
) : ProfileRepository {

    override suspend fun fetchProfile(username: String): Result<ProfileResponse> =
        ioDispatcher.runCatching { remoteDataSource.fetchProfile(username) }

    override suspend fun fetchFollowers(username: String): Result<List<FollowersResponse>> =
        ioDispatcher.runCatching { remoteDataSource.fetchFollowers(username) }
}
