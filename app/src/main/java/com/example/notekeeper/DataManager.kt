package com.example.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCoursesAndNotes()

    }


    private fun initializeCoursesAndNotes() {
        val androidIntents = CourseInfo("android_intents", "Android Programming with Intents")
        courses[androidIntents.courseId] = androidIntents
        val androidSync = CourseInfo( courseId = "android_sync", title = "Android Async Programming and Services")
        courses[androidSync.courseId] = androidSync
        val javaLang = CourseInfo( title = "Java Fundamentals: The Java Language",  courseId = "java_lang")
        courses[javaLang.courseId] = javaLang
        val javaCore = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses[javaCore.courseId] = javaCore

        notes.add(NoteInfo(androidIntents,"First Note","OMG I can't believe that this is my first note!"))
        notes.add(NoteInfo(androidSync,"Second note","Wow I believe that this is my second note!"))
        notes.add(NoteInfo(javaCore,"my java Note","Learning the core libraries"))
        notes.add(NoteInfo(javaLang,"my other java Note","Learning the core language"))
        notes.add(NoteInfo(javaLang,"How to be a Java Champion","What it takes to be a champion"))
        notes.add(NoteInfo(javaLang,"Java 11 features","Learningthe new Java 11 changes"))
    }
}