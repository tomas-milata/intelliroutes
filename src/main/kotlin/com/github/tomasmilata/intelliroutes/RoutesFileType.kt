package com.github.tomasmilata.intelliroutes

import com.intellij.openapi.fileTypes.LanguageFileType

import javax.swing.*

class RoutesFileType private constructor() : LanguageFileType(RoutesLanguage.INSTANCE) {

    override fun getName(): String {
        return "Routes"
    }

    override fun getDescription(): String {
        return "Play framework routes file"
    }

    override fun getDefaultExtension(): String {
        return "routes"
    }

    override fun getIcon(): Icon? {
        return RoutesIcons.FILE
    }

    companion object {
        val INSTANCE = RoutesFileType()
    }
}