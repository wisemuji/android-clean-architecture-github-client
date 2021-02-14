package com.wisemuji.githubclient.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wisemuji.domain.dto.ProfileDto
import com.wisemuji.domain.usecase.ProfileUseCase
import com.wisemuji.domain.usecase.ProfileUseCaseImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val profileUseCase: ProfileUseCase,
) : ViewModel() {

    private val _onError = MutableLiveData<Throwable>()
    val onError: LiveData<Throwable> get() = _onError

    private val _profile = MutableLiveData<ProfileDto>()
    val profile: LiveData<ProfileDto> get() = _profile

    val username = MutableLiveData<String>("")

    fun search() = viewModelScope.launch {
        fetchProfile(username = username.value?: "")
    }

    suspend fun fetchProfile(username: String) {
        profileUseCase
            .fetchProfile(username)
            .onSuccess {
                _profile.value = it
            }
            .onFailure {
                _onError.value = it
            }
    }

}
