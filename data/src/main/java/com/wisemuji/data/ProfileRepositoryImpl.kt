package com.wisemuji.data

import com.wisemuji.data.entity.FollowersResponse
import com.wisemuji.data.entity.ProfileResponse
import com.wisemuji.data.source.remote.ProfileRemoteDataSourceImpl

class ProfileRepositoryImpl(
    private val remoteDataSource: ProfileRemoteDataSourceImpl
) : ProfileRepository {

    override suspend fun fetchProfile(username: String): Result<ProfileResponse> =
        remoteDataSource.fetchProfile(username)

    override suspend fun fetchFollowers(username: String): Result<List<FollowersResponse>> =
        remoteDataSource.fetchFollowers(username)
}
