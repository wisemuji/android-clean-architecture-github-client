package com.wisemuji.data.source.remote

import retrofit2.Response

abstract class BaseRemoteDataSource {

    protected suspend fun <T> getResult(call: suspend () -> Response<T>): Result<T> {
        try {
            val response = call()
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) {
                    return Result.success(body)
                }
            }
            return error(Exception(response.message()))
        } catch (e: Exception) {
            return error(e)
        }
    }

    private fun <T> error(e: Exception): Result<T> {
        return Result.failure(e)
    }

}
