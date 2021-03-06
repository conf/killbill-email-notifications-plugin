/*
 * This file is generated by jOOQ.
*/
package org.killbill.billing.plugin.notification.dao.gen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.notification.dao.gen.tables.EmailNotificationsConfiguration;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmailNotificationsConfigurationRecord extends UpdatableRecordImpl<EmailNotificationsConfigurationRecord> implements Record5<ULong, String, String, String, Timestamp> {

    private static final long serialVersionUID = 1709573590;

    /**
     * Setter for <code>killbill.email_notifications_configuration.record_id</code>.
     */
    public void setRecordId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>killbill.email_notifications_configuration.record_id</code>.
     */
    public ULong getRecordId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>killbill.email_notifications_configuration.kb_account_id</code>.
     */
    public void setKbAccountId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>killbill.email_notifications_configuration.kb_account_id</code>.
     */
    public String getKbAccountId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>killbill.email_notifications_configuration.kb_tenant_id</code>.
     */
    public void setKbTenantId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>killbill.email_notifications_configuration.kb_tenant_id</code>.
     */
    public String getKbTenantId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>killbill.email_notifications_configuration.event_type</code>.
     */
    public void setEventType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>killbill.email_notifications_configuration.event_type</code>.
     */
    public String getEventType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>killbill.email_notifications_configuration.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>killbill.email_notifications_configuration.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<ULong, String, String, String, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<ULong, String, String, String, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION.RECORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION.KB_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION.KB_TENANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION.EVENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getRecordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getKbAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getKbTenantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getRecordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getKbAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getKbTenantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailNotificationsConfigurationRecord value1(ULong value) {
        setRecordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailNotificationsConfigurationRecord value2(String value) {
        setKbAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailNotificationsConfigurationRecord value3(String value) {
        setKbTenantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailNotificationsConfigurationRecord value4(String value) {
        setEventType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailNotificationsConfigurationRecord value5(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailNotificationsConfigurationRecord values(ULong value1, String value2, String value3, String value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmailNotificationsConfigurationRecord
     */
    public EmailNotificationsConfigurationRecord() {
        super(EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION);
    }

    /**
     * Create a detached, initialised EmailNotificationsConfigurationRecord
     */
    public EmailNotificationsConfigurationRecord(ULong recordId, String kbAccountId, String kbTenantId, String eventType, Timestamp createdAt) {
        super(EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION);

        set(0, recordId);
        set(1, kbAccountId);
        set(2, kbTenantId);
        set(3, eventType);
        set(4, createdAt);
    }
}
