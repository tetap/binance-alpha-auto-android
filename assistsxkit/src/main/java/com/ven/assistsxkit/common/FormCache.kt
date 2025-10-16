package com.ven.assistsxkit.common

import android.content.Context
import androidx.core.content.edit

object FormCache {
    private const val PREF_NAME = "tetap_form_cache"

    fun save(context: Context, key: String, value: String) {
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            .edit {
                putString(key, value)
            }
    }

    fun load(context: Context, key: String, def: String = ""): String {
        return context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            .getString(key, def) ?: def
    }
}
