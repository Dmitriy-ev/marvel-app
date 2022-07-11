package com.wiki.marvel_app.presentation.scenes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.wiki.marvel_app.R
import com.wiki.marvel_app.data.repositoryimp.MarvelRepositoryImp
import com.wiki.marvel_app.databinding.ActivityMainBinding
import com.wiki.marvel_app.domain.model.Character
import com.wiki.marvel_app.presentation.adapter.CharacterAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var characterAdapter: CharacterAdapter
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViewModel()
        initRecycler()
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.fetchCharacters()
        viewModel.character.observe(this) {
            characterAdapter.character = it as ArrayList<Character>
        }
    }

    private fun initRecycler() {
        characterAdapter = CharacterAdapter()
        binding.apply {
            with(recyclerViewCharacters) {
                layoutManager = GridLayoutManager(this@MainActivity, 2)
                adapter = characterAdapter
            }
        }
    }
}
