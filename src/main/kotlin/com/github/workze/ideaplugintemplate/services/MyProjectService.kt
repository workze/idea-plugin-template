package com.github.workze.ideaplugintemplate.services

import com.github.workze.ideaplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
