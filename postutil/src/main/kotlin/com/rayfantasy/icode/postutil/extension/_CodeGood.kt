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

import com.rayfantasy.icode.postutil.OnSuccessListener1
import com.rayfantasy.icode.postutil.PostUtil
import com.rayfantasy.icode.postutil.bean.CodeGood

fun CodeGood.loadCodeContent(init: OnSuccessListener1<String?>.() -> Unit) {
    val listener = OnSuccessListener1<String?>().apply(init)
    PostUtil.loadCodeContent(id!!) {
        onSuccess {
            content = it
            save()
            listener.onSuccess(it)
        }
        _onFailed = listener._onFailed
    }
}