package com.surrus.peopleinspace

import android.content.Intent
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.hamcrest.CoreMatchers.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class OrangeTaskTests : TestsValues() {

    @get:Rule
    val composeTestRule = createComposeRule()
    private val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testPersonDetailScreen() {

        //Launch MainActivity
        activityRule.launchActivity(Intent())

        //PersonListScreen
        composeTestRule.onNodeWithTag(personListTag).assertIsDisplayed() //check if PersonListScreen is displayed
        composeTestRule.onNodeWithText(personSergeyProkopyevTextView).performClick() //click on element with text "Sergey Prokopyev"

        //PersonDetailScreen
        composeTestRule.onNodeWithText(personSergeyProkopyevTextView).assertIsDisplayed() //check if name of person is displayed
        composeTestRule.onNodeWithContentDescription(imagePersonContentDesc).assertIsDisplayed() //check if image of person is displayed
        composeTestRule.onNodeWithText(personDetailScreenPersonBio).assertIsDisplayed() //check if textView with personBio is displayed
        composeTestRule.onNodeWithContentDescription(backButtonDesc).performClick() //click on top nov back button

        //PersonListScreen
        composeTestRule.onNodeWithTag(personListTag).assertIsDisplayed() //check if PersonListScreen is displayed

    }

    @Test
    fun testIssPositionScreen() {

        //Launch MainActivity
        activityRule.launchActivity(Intent())

        //PersonListScreen
        composeTestRule.onNodeWithTag(personListTag).assertIsDisplayed() //check if PersonListScreen is displayed
        composeTestRule.onNodeWithText(issPositionIconTextId).performClick() //click on bottom app bar ISS Position icon

        //ISSPositionScreen
        composeTestRule.onNodeWithTag(iSSPositionMapTag).assertIsDisplayed() //check if ISSPositionScreen is displayed
        composeTestRule.onNodeWithText(peopleIconTextId).performClick() //click on bottom app bar People icon

        //PersonListScreen
        composeTestRule.onNodeWithTag(personListTag).assertIsDisplayed() //check if PersonListScreen is displayed

    }

}