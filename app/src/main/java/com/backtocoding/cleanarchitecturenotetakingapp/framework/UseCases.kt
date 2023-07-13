package com.backtocoding.cleanarchitecturenotetakingapp.framework

import com.backtocoding.core.usecase.AddNote
import com.backtocoding.core.usecase.GetAllNotes
import com.backtocoding.core.usecase.GetNote
import com.backtocoding.core.usecase.RemoveNote

data class UseCases(
    val addNote: AddNote,
    val getAllNotes: GetAllNotes,
    val getNote: GetNote,
    val removeNote: RemoveNote
)
