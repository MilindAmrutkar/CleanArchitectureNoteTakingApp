package com.backtocoding.cleanarchitecturenotetakingapp.framework

import android.content.Context
import com.backtocoding.cleanarchitecturenotetakingapp.framework.db.DatabaseService
import com.backtocoding.cleanarchitecturenotetakingapp.framework.db.NoteEntity
import com.backtocoding.core.data.Note
import com.backtocoding.core.repository.NoteDataSource

class RoomNoteDataSource(context: Context) : NoteDataSource {
    val noteDao = DatabaseService.getInstance(context).noteDao()

    override suspend fun add(note: Note) = noteDao.addNoteEntity(NoteEntity.fromNote(note))

    override suspend fun get(id: Long): Note? = noteDao.getNoteEntity(id)?.toNote()

    override suspend fun getAll(): List<Note> = noteDao.getAllNoteEntities().map { it.toNote() }

    override suspend fun remove(note: Note) = noteDao.deleteNoteEntity(NoteEntity.fromNote(note))
}