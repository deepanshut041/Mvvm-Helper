/*
 *   Copyright (c)  2019 Squrlabs @ http://squrlabs.com
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *            http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.squrlabs.mvvm.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * The FeatureScoped custom scoping annotation specifies that the lifespan of a dependency be
 * the same as that of a Feature. This is used to annotate dependencies that behave like a
 * singleton within the lifespan of a Feature
 */
@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface FeatureScoped {
}
