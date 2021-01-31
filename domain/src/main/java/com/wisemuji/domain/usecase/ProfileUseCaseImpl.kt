package com.wisemuji.domain.usecase

import com.wisemuji.data.ProfileRepository
import com.wisemuji.domain.dto.FollowersDto
import com.wisemuji.domain.dto.ProfileDto
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ProfileUseCaseImpl @Inject constructor(
    private val profileRepository: ProfileRepository,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ProfileUseCase {

    override suspend fun fetchProfile(username: String): Result<ProfileDto> =
        withContext(ioDispatcher) {
            profileRepository
                .fetchProfile(username)
                .map {
                    ProfileDto.fromEntity(it)
                }
        }

    override suspend fun fetchFollowers(username: String): Result<List<FollowersDto>> =
        withContext(ioDispatcher) {
            profileRepository
                .fetchFollowers(username)
                .map {
                    it.map { response ->
                        FollowersDto.fromEntity(response)
                    }
                }
        }

}