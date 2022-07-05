/*
 * This file is generated by jOOQ.
 */
package de.crafted.api.service.user.jooq;


import de.crafted.api.service.user.jooq.tables.User;
import de.crafted.api.service.user.jooq.tables.UserTag;
import de.crafted.api.service.user.jooq.tables.records.UserRecord;
import de.crafted.api.service.user.jooq.tables.records.UserTagRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * the default schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<UserRecord> USER_PKEY = Internal.createUniqueKey(User.USER, DSL.name("user_pkey"), new TableField[] { User.USER.ID }, true);
    public static final UniqueKey<UserTagRecord> USER_TAG_PKEY = Internal.createUniqueKey(UserTag.USER_TAG, DSL.name("user_tag_pkey"), new TableField[] { UserTag.USER_TAG.USER_ID, UserTag.USER_TAG.TAG }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<UserTagRecord, UserRecord> USER_TAG__USER_TAG_USER_ID_FKEY = Internal.createForeignKey(UserTag.USER_TAG, DSL.name("user_tag_user_id_fkey"), new TableField[] { UserTag.USER_TAG.USER_ID }, Keys.USER_PKEY, new TableField[] { User.USER.ID }, true);
}
