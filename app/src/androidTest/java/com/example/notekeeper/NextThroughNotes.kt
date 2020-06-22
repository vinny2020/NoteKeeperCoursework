package com.example.notekeeper

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.rule.ActivityTestRule
import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

@RunWith(JUnit4::class)
class NextThroughNotes {
    @Rule
    @JvmField
    val noteListActivity = ActivityTestRule(NoteListActivity::class.java)

    @Test
    fun nextThroughNotes() {
        onData(allOf(instanceOf(NoteInfo::class.javaObjectType), equalTo(DataManager.notes[0]))).perform(
            click())

        for(index in 0..DataManager.notes.lastIndex) {

            val note = DataManager.notes[index]


            onView(withId(R.id.spinnerCourses)).check(matches(withSpinnerText(note.course?.title)))

            onView(withId(R.id.textNoteTitle)).check(matches(withText(note.title)))
            onView(withId(R.id.textNoteText)).check(matches(withText(note.text)))

            if(index != DataManager.notes.lastIndex)
                onView(allOf(withId(R.id.action_next), isEnabled())).perform(click())
        }

        onView(withId(R.id.action_next)).check(matches(not((isEnabled()))))

    }

}