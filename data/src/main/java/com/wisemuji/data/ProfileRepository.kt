package com.wisemuji.data

import com.wisemuji.data.entity.FollowersResponse
import com.wisemuji.data.entity.ProfileResponse
import com.wisemuji.data.source.remote.ProfileRemoteDataSourceImpl

class ProfileRepository(
    private val remoteDataSource: ProfileRemoteDataSourceImpl
) {

    suspend fun fetchProfile(username: String): Result<ProfileResponse> =
        remoteDataSource.fetchProfile(username)

    suspend fun fetchFollowers(username: String): Result<List<FollowersResponse>> =
        remoteDataSource.fetchFollowers(username)
}
