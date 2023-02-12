package com.surrus.peopleinspace

import com.surrus.common.repository.PeopleInSpaceRepository

open class TestsValues {

    //PersonListScreen
    internal val personListTag = "PersonList"
    internal val personSergeyProkopyevTextView = "Sergey Prokopyev"

    //PersonDetailScreen
    internal val imagePersonContentDesc = "Sergey Prokopyev"
    internal val personDetailScreenPersonBio = PeopleInSpaceRepository().personBio
    internal val backButtonDesc = "Back"

    //ISSPositionScreen
    internal val iSSPositionMapTag = "ISSPositionMap"

    //BottomAppBar
    internal val issPositionIconTextId = "ISS Position"
    internal val peopleIconTextId = "People"

}