package com.surrus.peopleinspace

import androidx.test.espresso.IdlingResource
import com.surrus.peopleinspace.personlist.PersonListViewModel

class ViewModelIdlingResource(
    private val viewModel: PersonListViewModel
) : IdlingResource {

    private var callback: IdlingResource.ResourceCallback? = null

    override fun getName(): String = "ViewModelIdlingResource"

    override fun isIdleNow(): Boolean {
        return viewModel.uiState.value != null
    }

    override fun registerIdleTransitionCallback(callback: IdlingResource.ResourceCallback?) {
        this.callback = callback
    }
}
