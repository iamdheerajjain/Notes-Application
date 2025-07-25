package com.maltaisn.notesshared

import android.os.Build
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

var datePatterns = listOf(
    DatePattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", TimeZone.getTimeZone("GMT"), 24),
    DatePattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", null, null),
    DatePattern("yyyy-MM-dd'T'HH:mm:ss.SSS", TimeZone.getDefault(), 23),
    DatePattern("yyyy-MM-dd'Z'", TimeZone.getTimeZone("GMT"), 11),
    DatePattern("yyyy-MM-dd", TimeZone.getDefault(), 10)
)

data class DatePattern(val pattern: String, val timeZone: TimeZone?, val length: Int?)

/**
 * Get UTC millis since epoch time for date patterns:
 * - `2020-01-05`: in UTC time zone, time is set to 00:00:00.000.
 * - `2020-01-05T09:12:11.000`: in local time zone.
 * - `2020-01-05T09:12:11.000Z`: in GMT time zone.
 * - `2020-01-05T09:12:11.000-07:00`: in specified time zone.
 * Throws an error if date can't be parsed according to any of these patterns.
 */
fun dateFor(date: String): Date {
    val dateFormat = SimpleDateFormat("", Locale.US)
    for (pattern in datePatterns) {
        if (pattern.length == null || date.length == pattern.length) {
            // Pattern character 'X' is only supported starting from API 24
            if (Build.VERSION.SDK_INT < 24 && pattern.pattern.contains("X")) {
                continue
            }
            if (pattern.timeZone != null) {
                dateFormat.timeZone = pattern.timeZone
            }
            dateFormat.applyPattern(pattern.pattern)
            return try {
                dateFormat.parse(date)
            } catch (e: ParseException) {
                null
            } ?: continue
        }
    }
    throw IllegalArgumentException("Invalid date literal")
}
