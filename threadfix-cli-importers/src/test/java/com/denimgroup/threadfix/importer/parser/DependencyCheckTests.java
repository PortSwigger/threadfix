////////////////////////////////////////////////////////////////////////
//
//     Copyright (c) 2009-2014 Denim Group, Ltd.
//
//     The contents of this file are subject to the Mozilla Public License
//     Version 2.0 (the "License"); you may not use this file except in
//     compliance with the License. You may obtain a copy of the License at
//     http://www.mozilla.org/MPL/
//
//     Software distributed under the License is distributed on an "AS IS"
//     basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
//     License for the specific language governing rights and limitations
//     under the License.
//
//     The Original Code is ThreadFix.
//
//     The Initial Developer of the Original Code is Denim Group, Ltd.
//     Portions created by Denim Group, Ltd. are Copyright (C)
//     Denim Group, Ltd. All Rights Reserved.
//
//     Contributor(s): Denim Group, Ltd.
//
////////////////////////////////////////////////////////////////////////

package com.denimgroup.threadfix.importer.parser;

import com.denimgroup.threadfix.importer.ScanLocationManager;
import com.denimgroup.threadfix.importer.TestConstants;
import com.denimgroup.threadfix.importer.utils.ScanComparisonUtils;
import org.junit.Test;

public class DependencyCheckTests implements TestConstants {

    // TODO fill in the rest
    public final static String[][] resultsVersion1_1 = new String[][] {
            {IMPROPER_AUTHENTICATION, "Medium", null, null},
    };

    @Test
    public void test1_1scan() {
        ScanComparisonUtils.compare(resultsVersion1_1, ScanLocationManager.getRoot() +
                "Static/DependencyCheck/DependencyCheck-Report-1.1.1.xml");
    }

}