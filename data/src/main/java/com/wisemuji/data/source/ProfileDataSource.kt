package com.wisemuji.data.source

import com.wisemuji.data.Resource
import com.wisemuji.data.entity.FetchFollowersResponse
import com.wisemuji.data.entity.FetchProfileResponse

interface ProfileDataSource {

    suspend fun fetchProfile(username: String): Resource<FetchProfileResponse>

    suspend fun fetchFollowers(username: String): Resource<List<FetchFollowersResponse>>
}
