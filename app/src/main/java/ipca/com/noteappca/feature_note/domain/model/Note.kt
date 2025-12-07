package ipca.com.noteappca.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import ipca.com.noteappca.ui.theme.BabyBlue
import ipca.com.noteappca.ui.theme.LightGreen
import ipca.com.noteappca.ui.theme.RedOrange
import ipca.com.noteappca.ui.theme.RedPink
import ipca.com.noteappca.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null

){
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
