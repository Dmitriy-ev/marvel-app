package com.wiki.marvel_app.presentation.scenes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wiki.marvel_app.data.dto.CharacterDTO
import com.wiki.marvel_app.data.repositoryimp.MarvelRepositoryImp
import com.wiki.marvel_app.domain.model.Character
import com.wiki.marvel_app.presentation.adapter.CharacterCellModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel() : ViewModel() {

    private val characterRepository = MarvelRepositoryImp

    private val _characters = MutableLiveData<List<Character>>()
    val character: LiveData<List<Character>>
        get() = _characters

    fun fetchCharacters() {
        viewModelScope.launch {
            withContext(Dispatchers.Default) {
                val character = characterRepository.getAllCharacter()
                _characters.postValue(character)
            }
        }
    }
}


