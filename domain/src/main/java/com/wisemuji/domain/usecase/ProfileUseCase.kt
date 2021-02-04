package com.wisemuji.domain.usecase

import com.wisemuji.domain.dto.FollowersDto
import com.wisemuji.domain.dto.ProfileDto

interface ProfileUseCase {

    suspend fun fetchProfile(username: String): Result<ProfileDto>

    suspend fun fetchFollowers(username: String): Result<List<FollowersDto>>

}
