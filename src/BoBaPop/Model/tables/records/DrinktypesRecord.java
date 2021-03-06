/*
 * This file is generated by jOOQ.
*/
package BoBaPop.Model.tables.records;


import BoBaPop.Model.tables.Drinktypes;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * InnoDB free: 23552 kB
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DrinktypesRecord extends UpdatableRecordImpl<DrinktypesRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 961475040;

    /**
     * Setter for <code>db_milktea.drinktypes.DrinkTypeID</code>.
     */
    public void setDrinktypeid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_milktea.drinktypes.DrinkTypeID</code>.
     */
    public Integer getDrinktypeid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_milktea.drinktypes.DrinkTypeName</code>.
     */
    public void setDrinktypename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_milktea.drinktypes.DrinkTypeName</code>.
     */
    public String getDrinktypename() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Drinktypes.DRINKTYPES.DRINKTYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Drinktypes.DRINKTYPES.DRINKTYPENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getDrinktypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDrinktypename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDrinktypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDrinktypename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrinktypesRecord value1(Integer value) {
        setDrinktypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrinktypesRecord value2(String value) {
        setDrinktypename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrinktypesRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DrinktypesRecord
     */
    public DrinktypesRecord() {
        super(Drinktypes.DRINKTYPES);
    }

    /**
     * Create a detached, initialised DrinktypesRecord
     */
    public DrinktypesRecord(Integer drinktypeid, String drinktypename) {
        super(Drinktypes.DRINKTYPES);

        set(0, drinktypeid);
        set(1, drinktypename);
    }
}
