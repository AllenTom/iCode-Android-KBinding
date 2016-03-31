/*
 * Copyright 2015-2016 RayFantasy Studio
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.rayfantasy.icode.postutil.extension

import android.util.Log

const val DEBUG = true

fun Any.v(msg: () -> String) {
    if (DEBUG)
        if (Log.isLoggable(tag, Log.VERBOSE)) v(msg())
}

fun Any.d(msg: () -> String) {
    if (DEBUG)
        if (Log.isLoggable(tag, Log.DEBUG)) d(msg())
}

fun Any.i(msg: () -> String) {
    if (DEBUG)
        if (Log.isLoggable(tag, Log.INFO)) i(msg())
}

fun Any.e(msg: () -> String) {
    if (DEBUG)
        if (Log.isLoggable(tag, Log.ERROR)) e(msg())
}

fun Any.wtf(msg: () -> String) {
    w(msg())
}

fun Any.v(msg: String) {
    v(tag, msg)
}

fun Any.d(msg: String) {
    d(tag, msg)
}

fun Any.i(msg: String) {
    i(tag, msg)
}

fun Any.w(msg: String) {
    w(tag, msg)
}

fun Any.e(msg: String) {
    e(tag, msg)
}

fun Any.wtf(msg: String) {
    wtf(tag, msg)
}

fun Any.v(tag: String, msg: String) {
    if (DEBUG)
        Log.v(tag, msg)
}

fun Any.d(tag: String, msg: String) {
    if (DEBUG)
        Log.d(tag, msg)
}

fun Any.i(tag: String, msg: String) {
    if (DEBUG)
        Log.i(tag, msg)
}

fun Any.w(tag: String, msg: String) {
    if (DEBUG)
        Log.w(tag, msg)
}

fun Any.e(tag: String, msg: String) {
    if (DEBUG)
        Log.e(tag, msg)
}

fun Any.wtf(tag: String, msg: String) {
    if (DEBUG)
        Log.wtf(tag, msg)
}

private val Any.tag: String
    get() = javaClass.simpleName