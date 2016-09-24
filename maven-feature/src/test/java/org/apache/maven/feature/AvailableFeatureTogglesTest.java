package org.apache.maven.feature;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This implements some checks on the enumeration type.
 * 
 * @author Karl Heinz Marbaise <a href="mailto:khmarbaise@apache.org">khmarbaise@apache.org</a>
 * @since 3.4.0
 */
public class AvailableFeatureTogglesTest
{

    @Test
    public void getAvailableFeatureToggolesShouldReturnFour()
    {
        assertEquals( 4, AvailableFeatureToggles.getAvailableFeatureToggles().length );
    }

    @Test
    public void getAvailableFeatureTogglesShouldReturnCorrectValues()
    {
        AvailableFeatureToggles[] aft = AvailableFeatureToggles.getAvailableFeatureToggles();

        assertEquals( AvailableFeatureToggles.MNG9991, aft[0] );
        assertEquals( AvailableFeatureToggles.MNG9992, aft[1] );
        assertEquals( AvailableFeatureToggles.MNG9993, aft[2] );
        assertEquals( AvailableFeatureToggles.MNG10000, aft[3] );

    }
}