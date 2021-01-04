package com.wisemuji.data

data class Resource<out T>(
    val status: Status, val data: T?, val errorMessage: String?
) {

    enum class Status {
        SUCCESS,
        ERROR
    }

    companion object {
        fun <T> success(data: T): Resource<T> {
            return Resource(
                status = Status.SUCCESS,
                data = data,
                errorMessage = null
            )
        }

        fun <T> error(errorMessage: String, data: T? = null): Resource<T> {
            return Resource(
                status = Status.ERROR,
                data = data,
                errorMessage = errorMessage
            )
        }
    }
}
