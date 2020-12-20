package com.github.johnclara.intellijcodegen.services

import com.intellij.openapi.project.Project
import com.github.johnclara.intellijcodegen.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
