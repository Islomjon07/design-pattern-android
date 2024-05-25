package com.example.design_pattern_project.factory

interface FilePatternFactory {
    fun createFromFileName(fileName: String): FilePatternFactory
}

class StandardFileFactory : FilePatternFactory {
    override fun createFromFileName(fileName: String): FilePatternFactory =
        when (fileName.substringAfterLast('.')) {
            "xml" -> XmlFileParsed()
            "json" -> JsonFileParsed()
            else -> throw Exception("")
        }
}

class JsonFileParsed : FilePatternFactory {
    override fun createFromFileName(fileName: String): FilePatternFactory {
        return JsonFileParsed()
    }

}

class XmlFileParsed : FilePatternFactory {
    override fun createFromFileName(fileName: String): FilePatternFactory {
        return XmlFileParsed()
    }

}
