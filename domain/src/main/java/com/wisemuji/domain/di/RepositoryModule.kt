package com.wisemuji.domain.di

import com.wisemuji.data.ProfileRepository
import com.wisemuji.data.ProfileRepositoryImpl
import com.wisemuji.data.source.remote.ProfileRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideRrofileRepository(remoteDataSource: ProfileRemoteDataSource): ProfileRepository =
        ProfileRepositoryImpl(remoteDataSource = remoteDataSource)
}

