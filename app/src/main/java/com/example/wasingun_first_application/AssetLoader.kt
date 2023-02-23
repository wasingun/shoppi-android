package com.example.wasingun_first_application

import android.content.Context
import android.util.Log

class AssetLoader {

    fun getJsonString(context: Context, fileName: String): String?{
        return kotlin.runCatching {
            loadAsset(context, fileName)
        }. getOrNull()
    }

    private fun loadAsset(context:Context, fileName: String): String {
        return context.assets.open(fileName).use {inputStream ->
            val size = inputStream.available() // 바이트 수를 반환
            val bytes = ByteArray(size) // 바이트 수 만큼의 버퍼를 반환
            inputStream.read(bytes) //inputStream에서 bytes 만큼 크기를 불러들임
            String(bytes) // bytes의 내용을 string으로 반환
        }
    }
}