/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
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

package com.alibaba.nacos.naming.misc;

/**
 * Synchronizer.
 *
 *  同步状态
 *  1.同一集群同步server的情况
 *  2.同一个service，同步于不同的NacosServer
 * @author nacos
 */
public interface Synchronizer {

    /**
     * Send message to server.
     *
     * @param serverIP target server address
     * @param msg      message to send
     */
    void send(String serverIP, Message msg);

    /**
     * Get message from server using message key.
     *
     * @param serverIP source server address
     * @param key      message key
     * @return message
     */
    Message get(String serverIP, String key);
}
