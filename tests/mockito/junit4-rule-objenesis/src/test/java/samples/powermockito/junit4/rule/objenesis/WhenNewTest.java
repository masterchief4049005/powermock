/*
 * Copyright 2008 the original author or authors.
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
package samples.powermockito.junit4.rule.objenesis;

import org.junit.Ignore;
import org.junit.Rule;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.rule.PowerMockRule;
import samples.expectnew.ExpectNewDemo;
import samples.newmocking.MyClass;
import samples.powermockito.junit4.whennew.WhenNewCases;

import java.io.DataInputStream;

/**
 * Test class to demonstrate new instance mocking using whenConstructionOf(..).
 * 
 */
@SuppressWarnings("PrimitiveArrayArgumentToVariableArgMethod")
@Ignore("Since upgrading to JVM 1.6.0_24 lots of tests started to fail")
@PrepareForTest({ MyClass.class, ExpectNewDemo.class, DataInputStream.class })
public class WhenNewTest extends WhenNewCases {
	@Rule
	public PowerMockRule powerMockRule = new PowerMockRule();

}
