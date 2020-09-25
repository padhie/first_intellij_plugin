package com.github.padhie.firstintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.padhie.firstintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
