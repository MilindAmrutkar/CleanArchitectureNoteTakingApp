package com.backtocoding.cleanarchitecturenotetakingapp.framework

import com.backtocoding.core.usecase.AddNote
import com.backtocoding.core.usecase.GetAllNotes
import com.backtocoding.core.usecase.GetNote
import com.backtocoding.core.usecase.RemoveNote

/*
*   This class is created to access all the use cases
*   that we have inside our usecase package
*   inside core module.
*   This allows us to instantiate all the use caess and use them in our architecture,
*   in our ViewModel especially.
*   Reason: For now, when we define our use cases there will be code duplication
*   but then when we remove this and put it inside our DI, that will allow us to inject
*   our use cases directly where we need them so that it is much easier
*   and more transparent to use this functionality in this way.
*/
data class UseCases(
    val addNote: AddNote,
    val getAllNotes: GetAllNotes,
    val getNote: GetNote,
    val removeNote: RemoveNote
)
