package com.maltaisn.notes.model.converter

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import org.junit.Test
import java.util.Date
import kotlin.test.assertEquals
import kotlin.test.assertNotSame

class DateTimeConverterTest {

    private val json = Json

    @Test
    fun `should convert date to string`() {
        assertEquals(1587230071650,
            DateTimeConverter.toLong(Date(1587230071650)))
    }

    @Test
    fun `should convert string to date`() {
        assertEquals(Date(1587230071650), DateTimeConverter.toDate(1587230071650))
    }

    @Test
    fun `should convert date to json literal`() {
        assertEquals("\"2020-04-18T17:14:31.650Z\"",
            json.encodeToString(DateTimeConverter, Date(1587230071650)))
    }

    @Test
    fun `should convert json literal to date`() {
        assertEquals(Date(1587230071650),
            json.decodeFromString(DateTimeConverter, "\"2020-04-18T17:14:31.650Z\""))
    }

    @Test
    fun `should be thread safe`() {
        // Make sure that SimpleDateFormat instance is different in different threads.
        val dateFormat1 = DateTimeConverter.dateFormat
        val dateFormat2 = runBlocking {
            withContext(Dispatchers.IO) {
                DateTimeConverter.dateFormat
            }
        }
        assertNotSame(dateFormat1, dateFormat2)
    }
}
