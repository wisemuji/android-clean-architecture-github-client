package com.wisemuji.data.source

import com.wisemuji.data.Resource
import com.wisemuji.data.entity.FollowersResponse
import com.wisemuji.data.entity.ProfileResponse

interface ProfileDataSource {

    suspend fun fetchProfile(username: String): Resource<ProfileResponse>

    suspend fun fetchFollowers(username: String): Resource<List<FollowersResponse>>
}
