package com.example.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeNotes() {
       notes.add(NoteInfo(CourseInfo("android_intents", "Android Programming with Intents"),"First Note","OMG I can't believe that this is my first note!"))
       notes.add(NoteInfo(CourseInfo("android_sync", "Android Async Programming and Services"),"Second note","Wow I believe that this is my second note!"))
       notes.add(NoteInfo(CourseInfo("java_lang", "Core Java"),"my java Note","Learning the core libraries"))
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)
        course = CourseInfo( courseId = "android_sync", title = "Android Async Programming and Services")
        courses[course.courseId] = course
        course = CourseInfo( title = "Java Fundamentals: The Java Language",  courseId = "java_lang")
        courses.set(course.courseId, course)
        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses[course.courseId] = course


    }
}