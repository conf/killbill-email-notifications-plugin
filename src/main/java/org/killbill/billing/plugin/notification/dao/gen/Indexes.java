/*
 * Copyright 2014-2017 Groupon, Inc
 * Copyright 2014-2017 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/*
 * This file is generated by jOOQ.
*/
package org.killbill.billing.plugin.notification.dao.gen;


import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.AbstractKeys;
import org.killbill.billing.plugin.notification.dao.gen.tables.EmailNotificationsConfiguration;

/**
 * A class modelling indexes of tables of the <code>killbill</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_EVENT_TYPE_KB_ACCOUNT_ID = Indexes0.EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_EVENT_TYPE_KB_ACCOUNT_ID;
    public static final Index EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_EVENT_TYPE_KB_TENANT_ID = Indexes0.EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_EVENT_TYPE_KB_TENANT_ID;
    public static final Index EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_KB_ACCOUNT_ID = Indexes0.EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_KB_ACCOUNT_ID;
    public static final Index EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_KB_TENANT_ID = Indexes0.EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_KB_TENANT_ID;
    public static final Index EMAIL_NOTIFICATIONS_CONFIGURATION_PRIMARY = Indexes0.EMAIL_NOTIFICATIONS_CONFIGURATION_PRIMARY;
    public static final Index EMAIL_NOTIFICATIONS_CONFIGURATION_RECORD_ID = Indexes0.EMAIL_NOTIFICATIONS_CONFIGURATION_RECORD_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_EVENT_TYPE_KB_ACCOUNT_ID = createIndex("kenui_configuration_event_type_kb_account_id", EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION, new OrderField[] {EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION.EVENT_TYPE, EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION.KB_ACCOUNT_ID }, true);
        public static Index EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_EVENT_TYPE_KB_TENANT_ID = createIndex("kenui_configuration_event_type_kb_tenant_id", EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION, new OrderField[] { EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION.EVENT_TYPE, EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION.KB_TENANT_ID }, false);
        public static Index EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_KB_ACCOUNT_ID = createIndex("kenui_configuration_kb_account_id", EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION, new OrderField[] { EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION.KB_ACCOUNT_ID }, false);
        public static Index EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_KB_TENANT_ID = createIndex("kenui_configuration_kb_tenant_id", EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION, new OrderField[] { EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION.KB_TENANT_ID }, false);
        public static Index EMAIL_NOTIFICATIONS_CONFIGURATION_PRIMARY = createIndex("PRIMARY", EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION, new OrderField[] { EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION.RECORD_ID }, true);
        public static Index EMAIL_NOTIFICATIONS_CONFIGURATION_RECORD_ID = createIndex("record_id", EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION, new OrderField[] { EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION.RECORD_ID }, true);
    }
}