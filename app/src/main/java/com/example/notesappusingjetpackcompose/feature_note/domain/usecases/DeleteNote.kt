package com.example.notesappusingjetpackcompose.feature_note.domain.usecases

import com.example.notesappusingjetpackcompose.feature_note.domain.model.Note
import com.example.notesappusingjetpackcompose.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}