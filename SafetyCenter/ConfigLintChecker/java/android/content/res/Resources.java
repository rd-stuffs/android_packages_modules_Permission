/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.content.res;

/** Stub class to compile the linter for host execution. */
public final class Resources {
    /** Constant used in the Safety Center config parser. */
    public static final int ID_NULL = 0;

    /** Class used in the Safety Center config parser. */
    public Resources() {}

    /** Method used in the Safety Center config parser. */
    public int getIdentifier(String name, String defType, String defPackage) {
        return ID_NULL + 1;
    }
}
