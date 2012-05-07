/**
 * Copyright (c) 2011 Yahoo! Inc. All rights reserved.
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
 * limitations under the License. See accompanying LICENSE file.
 */

package com.yahoo.pasc.paxos.messages;

public enum MessageType {

    REQUEST, INLINEREQ, REPLY, ACCEPT, ACCEPTED, DIGEST, EXECUTE, PREREPLY, HELLO, PREPARE, PREPARED, LEAD_CHANGE;
    
    public static MessageType getMessageType(PaxosMessage m) {
        if (m instanceof InlineRequest)
            return INLINEREQ;
        if (m instanceof Request)
            return REQUEST;
        if (m instanceof Reply)
            return REPLY;
        if (m instanceof Accept)
            return ACCEPT;
        if (m instanceof Accepted)
            return ACCEPTED;
        if (m instanceof Digest)
            return DIGEST;
        if (m instanceof Execute)
            return EXECUTE;
        if (m instanceof PreReply)
            return PREREPLY;
        if (m instanceof Hello)
            return HELLO;
        if (m instanceof Prepare)
            return PREPARE;
        if (m instanceof Prepared)
            return PREPARED;
        if (m instanceof LeadershipChange)
            return LEAD_CHANGE;
        throw new IllegalArgumentException("Unknown message type: " + m);
    }
}
