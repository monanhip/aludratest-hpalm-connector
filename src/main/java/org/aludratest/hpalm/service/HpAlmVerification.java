/*
 * Copyright (C) 2015 Hamburg Sud and the contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aludratest.hpalm.service;

import org.aludratest.service.ElementName;
import org.aludratest.service.ElementType;
import org.aludratest.service.TechnicalLocator;
import org.aludratest.service.Verification;
import org.databene.commons.Validator;

public interface HpAlmVerification extends Verification {
	
	public void assertEntityFieldMatches(@ElementType EntityType entityType, @ElementName long id,
			@TechnicalLocator String fieldName, Validator<String> validator);

	public void assertEntityExists(@ElementType EntityType entityType, @ElementName long id);

	public void assertEntityNotExists(@ElementType EntityType entityType, @ElementName long id);

	public void assertAnyEntityExists(@ElementType EntityType entityType, @TechnicalLocator String query);

	public void assertNoEntityExists(@ElementType EntityType entityType, @TechnicalLocator String query);

}
