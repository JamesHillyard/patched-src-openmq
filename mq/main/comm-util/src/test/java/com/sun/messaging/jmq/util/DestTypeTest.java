/*
 * Copyright (c) 2021 Contributors to the Eclipse Foundation.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.messaging.jmq.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class DestTypeTest {
    @Nested
    class isQueueStr {
        @Test
        void queueShouldBeRecognizedAsQueue() {
            assertThat(DestType.isQueueStr("queue")).isTrue();
        }

        @Test
        void nullShallBeRecognizedAsNotQueue() {
            assertThat(DestType.isQueueStr(null)).isFalse();
        }

        @Test
        void topicShouldBeRecognizedAsNotQueue() {
            assertThat(DestType.isQueueStr("topic")).isFalse();
        }

        @Test
        void randomStringShouldBeRecognizedAsNotQueue() {
            assertThat(DestType.isQueueStr("zaqwsxcderfv")).isFalse();
        }
    }
}
