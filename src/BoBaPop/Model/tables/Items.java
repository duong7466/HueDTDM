/*
 * This file is generated by jOOQ.
*/
package BoBaPop.Model.tables;


import BoBaPop.Model.DbMilktea;
import BoBaPop.Model.Indexes;
import BoBaPop.Model.Keys;
import BoBaPop.Model.tables.records.ItemsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * InnoDB free: 23552 kB; (`BillID`) REFER `db_milktea/bills`(`BillID`); (`DrinkID`
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Items extends TableImpl<ItemsRecord> {

    private static final long serialVersionUID = -1279314137;

    /**
     * The reference instance of <code>db_milktea.items</code>
     */
    public static final Items ITEMS = new Items();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ItemsRecord> getRecordType() {
        return ItemsRecord.class;
    }

    /**
     * The column <code>db_milktea.items.BillID</code>.
     */
    public final TableField<ItemsRecord, Integer> BILLID = createField("BillID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_milktea.items.DrinkID</code>.
     */
    public final TableField<ItemsRecord, Integer> DRINKID = createField("DrinkID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_milktea.items.Quantity</code>.
     */
    public final TableField<ItemsRecord, Integer> QUANTITY = createField("Quantity", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_milktea.items.Total</code>.
     */
    public final TableField<ItemsRecord, Double> TOTAL = createField("Total", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * Create a <code>db_milktea.items</code> table reference
     */
    public Items() {
        this(DSL.name("items"), null);
    }

    /**
     * Create an aliased <code>db_milktea.items</code> table reference
     */
    public Items(String alias) {
        this(DSL.name(alias), ITEMS);
    }

    /**
     * Create an aliased <code>db_milktea.items</code> table reference
     */
    public Items(Name alias) {
        this(alias, ITEMS);
    }

    private Items(Name alias, Table<ItemsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Items(Name alias, Table<ItemsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "InnoDB free: 23552 kB; (`BillID`) REFER `db_milktea/bills`(`BillID`); (`DrinkID`");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DbMilktea.DB_MILKTEA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ITEMS_DRINKID, Indexes.ITEMS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ItemsRecord> getPrimaryKey() {
        return Keys.KEY_ITEMS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ItemsRecord>> getKeys() {
        return Arrays.<UniqueKey<ItemsRecord>>asList(Keys.KEY_ITEMS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Items as(String alias) {
        return new Items(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Items as(Name alias) {
        return new Items(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Items rename(String name) {
        return new Items(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Items rename(Name name) {
        return new Items(name, null);
    }
}
