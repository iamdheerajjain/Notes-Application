package com.maltaisn.notes.model.converter

import com.maltaisn.notes.model.entity.BlankNoteMetadata
import com.maltaisn.notes.model.entity.ListNoteMetadata
import org.junit.Test
import kotlin.test.assertEquals

class NoteMetadataConverterTest {

    @Test
    fun `should convert blank metadata to string`() {
        assertEquals("""{"type":"blank"}""",
            NoteMetadataConverter.toString(BlankNoteMetadata))
    }

    @Test
    fun `should convert blank metadata json to metadata`() {
        assertEquals(BlankNoteMetadata,
            NoteMetadataConverter.toMetadata("""{"type":"blank"}"""))
    }

    @Test
    fun `should convert list metadata to string`() {
        assertEquals("""{"type":"list","checked":[false,true]}""",
            NoteMetadataConverter.toString(ListNoteMetadata(listOf(false, true))))
    }

    @Test
    fun `should convert list metadata json to metadata`() {
        assertEquals(ListNoteMetadata(listOf(false, true)),
            NoteMetadataConverter.toMetadata("""{"type":"list","checked":[false,true]}"""))
    }
}
