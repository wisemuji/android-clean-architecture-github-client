package com.wisemuji.data.source.remote

import com.wisemuji.data.entity.FetchFollowersResponse
import com.wisemuji.data.entity.FetchProfileResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ProfileRemoteService {

    @GET("/users/{username}")
    suspend fun fetchProfile(
        @Path("username") username: String
    ) : Response<FetchProfileResponse>

    @GET("/users/{username}/followers")
    suspend fun fetchFollowers(
        @Path("username") username: String
    ) : Response<List<FetchFollowersResponse>>
}
