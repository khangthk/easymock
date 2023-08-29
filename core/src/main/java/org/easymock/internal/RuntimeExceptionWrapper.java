/*
 * Copyright 2001-2023 the original author or authors.
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
package org.easymock.internal;

/**
 * Wraps a RuntimeException that was thrown by a method invocation so that EasyMock knows the difference between an invocation
 * exception and an real unexpected one.
 *
 * @author OFFIS, Tammo Freese
 */
public class RuntimeExceptionWrapper extends RuntimeException {

    private static final long serialVersionUID = -3483500330975410177L;

    private final RuntimeException runtimeException;

    public RuntimeExceptionWrapper(RuntimeException runtimeException) {
        this.runtimeException = runtimeException;
    }

    public RuntimeException getRuntimeException() {
        return runtimeException;
    }
}
