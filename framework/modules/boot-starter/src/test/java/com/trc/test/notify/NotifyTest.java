/*
 * Copyright 2019. the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.trc.test.notify;


import com.ecfront.dew.common.Resp;
import ms.dew.Dew;
import org.junit.Assert;
import org.springframework.stereotype.Component;

/**
 * Notify test.
 *
 * @author gudaoxuri
 */
@Component
public class NotifyTest {

    /**
     * Test all.
     *
     * @throws Exception the exception
     */
    public void testAll() throws Exception {
        Resp<Void> result = Dew.notify.send("flag1", "测试消息，默认通知人", "测试");
        Assert.assertTrue(result.ok());
    }

}
