/*
 * Copyright 2012-2014 the original author or authors.
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

package svsolver.traditional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Basic integration tests for demo application.
 * 
 * @author
 */
@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext
public class SampleTraditionalApplicationTests {

	@Value("${local.server.port}")
	private int port;

	@Test
	public void testHomeJsp() throws Exception {
		ResponseEntity<String> entity = new org.springframework.boot.test.web.client.TestRestTemplate().getForEntity(
				"http://localhost:" + this.port, String.class);
		assertEquals(HttpStatus.OK, entity.getStatusCode());
		String body = entity.getBody();
		assertTrue("Wrong body:\n" + body, body.contains("<html>"));
		assertTrue("Wrong body:\n" + body, body.contains("<h1>Home</h1>"));
	}

	@Test
	public void testStaticPage() throws Exception {
		ResponseEntity<String> entity = new TestRestTemplate().getForEntity(
				"http://localhost:" + this.port + "/index.html", String.class);
		assertEquals(HttpStatus.OK, entity.getStatusCode());
		String body = entity.getBody();
		assertTrue("Wrong body:\n" + body, body.contains("<html>"));
		assertTrue("Wrong body:\n" + body, body.contains("<h1>Hello</h1>"));
	}

}
