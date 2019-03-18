package com.jetbrains.rider.t4plugin

import com.intellij.openapi.fileTypes.LanguageFileType

object T4FileType : LanguageFileType(T4TemplateLanguage) {
    override fun getName() = T4TemplateLanguage.displayName
    override fun getDefaultExtension() = "tt"
    override fun getDescription() = "T4 file"
    override fun getIcon() = T4IconHolder.Icon
}
