package com.wisemuji.data.di

import com.wisemuji.data.source.remote.ProfileRemoteDataSource
import com.wisemuji.data.source.remote.ProfileRemoteDataSourceImpl
import com.wisemuji.data.source.remote.ProfileRemoteService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    @Singleton
    fun provideProfileRemoteDataSource(
        profileRemoteService: ProfileRemoteService
    ): ProfileRemoteDataSource =
        ProfileRemoteDataSourceImpl(service = profileRemoteService)
}
