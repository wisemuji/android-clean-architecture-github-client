package com.wisemuji.data.source.remote

import com.wisemuji.data.Resource
import com.wisemuji.data.entity.FollowersResponse
import com.wisemuji.data.entity.ProfileResponse
import com.wisemuji.data.source.ProfileDataSource

class ProfileRemoteDataSourceImpl(
    private val service: ProfileRemoteService,
) : ProfileDataSource, BaseRemoteDataSource() {

    override suspend fun fetchProfile(username: String): Resource<ProfileResponse> =
        getResult { service.fetchProfile(username) }

    override suspend fun fetchFollowers(username: String): Resource<List<FollowersResponse>> =
        getResult { service.fetchFollowers(username) }
}