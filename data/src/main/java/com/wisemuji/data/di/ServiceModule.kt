package com.wisemuji.data.di

import com.wisemuji.data.source.remote.ProfileRemoteService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ServiceModule {

    @Provides
    @Singleton
    fun provideProfileRemoteService(retrofit: Retrofit): ProfileRemoteService =
        retrofit.create(ProfileRemoteService::class.java)
}
