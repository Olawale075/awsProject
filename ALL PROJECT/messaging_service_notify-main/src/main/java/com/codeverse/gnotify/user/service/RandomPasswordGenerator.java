/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.codeverse.gnotify.user.service;

public class RandomPasswordGenerator {

    private final int numberOfCharactersInPassword;

    public RandomPasswordGenerator(final int numberOfCharactersInPassword) {
        this.numberOfCharactersInPassword = numberOfCharactersInPassword;
    }

    /*public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String passwords[] = {"password", "Password2", "Password3"};
        for (String password : passwords) {
            System.out.println(passwordEncoder.encode(password));
        }
    }*/

    public String generate() {

        final StringBuilder passwordBuilder = new StringBuilder(this.numberOfCharactersInPassword);
        for (int i = 0; i < this.numberOfCharactersInPassword; i++) {
            passwordBuilder.append((char) ((int) (Math.random() * 26) + 97));
        }
        return passwordBuilder.toString();
    }

}
