/*
 * This file is generated by jOOQ.
 */
package de.crafted.api.service.common.jooq.tables.records;


import de.crafted.api.service.common.jooq.enums.Tag;
import de.crafted.api.service.common.jooq.tables.TicketTag;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TicketTagRecord extends UpdatableRecordImpl<TicketTagRecord> implements Record2<Long, Tag> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ticket_tag.ticket_id</code>.
     */
    public void setTicketId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>ticket_tag.ticket_id</code>.
     */
    public Long getTicketId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ticket_tag.tag</code>.
     */
    public void setTag(Tag value) {
        set(1, value);
    }

    /**
     * Getter for <code>ticket_tag.tag</code>.
     */
    public Tag getTag() {
        return (Tag) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Tag> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Tag> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, Tag> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TicketTag.TICKET_TAG.TICKET_ID;
    }

    @Override
    public Field<Tag> field2() {
        return TicketTag.TICKET_TAG.TAG;
    }

    @Override
    public Long component1() {
        return getTicketId();
    }

    @Override
    public Tag component2() {
        return getTag();
    }

    @Override
    public Long value1() {
        return getTicketId();
    }

    @Override
    public Tag value2() {
        return getTag();
    }

    @Override
    public TicketTagRecord value1(Long value) {
        setTicketId(value);
        return this;
    }

    @Override
    public TicketTagRecord value2(Tag value) {
        setTag(value);
        return this;
    }

    @Override
    public TicketTagRecord values(Long value1, Tag value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TicketTagRecord
     */
    public TicketTagRecord() {
        super(TicketTag.TICKET_TAG);
    }

    /**
     * Create a detached, initialised TicketTagRecord
     */
    public TicketTagRecord(Long ticketId, Tag tag) {
        super(TicketTag.TICKET_TAG);

        setTicketId(ticketId);
        setTag(tag);
    }
}