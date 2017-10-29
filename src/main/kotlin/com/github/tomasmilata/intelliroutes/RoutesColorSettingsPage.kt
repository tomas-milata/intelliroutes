package com.github.tomasmilata.intelliroutes

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.*
import org.jetbrains.annotations.*

import javax.swing.*

class RoutesColorSettingsPage : ColorSettingsPage {

    override fun getIcon(): Icon? {
        return RoutesIcons.FILE
    }

    override fun getHighlighter(): SyntaxHighlighter {
        return RoutesSyntaxHighlighter()
    }

    override fun getDemoText(): String {
        return """
            # Gets a single user with the given ID.
            GET    /user/:userId    UserController.get(userId: String)

            bad character
        """.trimIndent()
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<ColorDescriptor> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    override fun getDisplayName(): String {
        return "Play 2 Routes"
    }

    companion object {
        private val DESCRIPTORS = arrayOf(
                AttributesDescriptor("HTTP Verb", RoutesSyntaxHighlighter.VERB),
                AttributesDescriptor("Path Parameter", RoutesSyntaxHighlighter.PATH_PARAMETER),
                AttributesDescriptor("Static Path Segment", RoutesSyntaxHighlighter.STATIC_PATH_SEGMENT),
                AttributesDescriptor("Path Separator", RoutesSyntaxHighlighter.SLASH),
                AttributesDescriptor("Controller Call Parameter", RoutesSyntaxHighlighter.ARGUMENT),
                AttributesDescriptor("Comment", RoutesSyntaxHighlighter.COMMENT),
                AttributesDescriptor("Bad Character", RoutesSyntaxHighlighter.BAD_CHARACTER)
        )
    }
}