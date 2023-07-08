package com.backtocoding.core.usecase

import com.backtocoding.core.data.Note
import com.backtocoding.core.repository.NoteRepository

class RemoveNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}