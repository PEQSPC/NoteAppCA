package ipca.com.noteappca.feature_note.presentation.notes.viewmodels

import ipca.com.noteappca.feature_note.domain.model.Note
import ipca.com.noteappca.feature_note.domain.util.NoteOrder
import ipca.com.noteappca.feature_note.domain.util.OrderType

data class NodesState(
    val notes: List<Note> = emptyList(),
    val nodeOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
