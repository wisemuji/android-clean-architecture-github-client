package com.wisemuji.data

import com.wisemuji.data.entity.FollowersResponse
import com.wisemuji.data.entity.ProfileResponse
import com.wisemuji.data.source.remote.ProfileRemoteDataSource

class ProfileRepositoryImpl(
    private val remoteDataSource: ProfileRemoteDataSource
) : ProfileRepository {

    override suspend fun fetchProfile(username: String): Result<ProfileResponse> =
        remoteDataSource.fetchProfile(username)

    override suspend fun fetchFollowers(username: String): Result<List<FollowersResponse>> =
        remoteDataSource.fetchFollowers(username)
}
