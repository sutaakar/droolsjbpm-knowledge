/*
 * Copyright 2013 JBoss by Red Hat.
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

package org.kie.api.executor;

import java.util.Date;

/**
 * Marks given executor command it is reoccurring and shall be rescheduled after completion of single instance.
 *
 */
public interface Reoccurring {

	/**
	 * Returns next time to be scheduled. Date must be in future as jobs cannot be scheduled in past.
	 * Returns null in case it should not be scheduled any more.
	 * @return
	 */
	Date getScheduleTime();
}
