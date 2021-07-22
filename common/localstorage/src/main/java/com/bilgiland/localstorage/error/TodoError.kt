package com.bilgiland.localstorage.error

sealed class TodoError : Throwable() {

    object WritetFailed : TodoError()

    object UpdateFailed : TodoError()

    object DeleteFailed : TodoError()

}