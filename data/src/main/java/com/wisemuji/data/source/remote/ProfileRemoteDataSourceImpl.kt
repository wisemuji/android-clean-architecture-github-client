package com.wisemuji.data.source.remote

import com.wisemuji.data.Resource
import com.wisemuji.data.entity.FetchFollowersResponse
import com.wisemuji.data.entity.FetchProfileResponse
import com.wisemuji.data.source.ProfileDataSource

class ProfileRemoteDataSourceImpl(
    private val service: ProfileRemoteService,
) : ProfileDataSource, BaseRemoteDataSource() {

    override suspend fun fetchProfile(username: String): Resource<FetchProfileResponse> =
        getResult { service.fetchProfile(username) }

    override suspend fun fetchFollowers(username: String): Resource<List<FetchFollowersResponse>> =
        getResult { service.fetchFollowers(username) }
}
