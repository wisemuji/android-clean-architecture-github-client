package com.wisemuji.domain.di

import com.wisemuji.data.ProfileRepository
import com.wisemuji.domain.usecase.ProfileUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun provideProfileUseCase(profileRepository: ProfileRepository) =
        ProfileUseCaseImpl(profileRepository = profileRepository)
}

