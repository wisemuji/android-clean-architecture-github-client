package com.wisemuji.domain.usecase

import com.wisemuji.data.ProfileRepositoryImpl
import com.wisemuji.domain.dto.FollowersDto
import com.wisemuji.domain.dto.ProfileDto
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProfileUseCase(
    private val profileRepository: ProfileRepositoryImpl,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) {

    suspend fun fetchProfile(username: String): Result<ProfileDto> =
        withContext(ioDispatcher) {
            profileRepository
                .fetchProfile(username)
                .map {
                    ProfileDto.fromEntity(it)
                }
        }

    suspend fun fetchFollowers(username: String): Result<List<FollowersDto>> =
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
