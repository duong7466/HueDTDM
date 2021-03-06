/*
 * This file is generated by jOOQ.
*/
package BoBaPop.Model.tables.records;


import BoBaPop.Model.tables.VwSumDrinkByBill;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VwSumDrinkByBillRecord extends TableRecordImpl<VwSumDrinkByBillRecord> implements Record2<Integer, BigInteger> {

    private static final long serialVersionUID = 1867652278;

    /**
     * Setter for <code>db_milktea.vw_sum_drink_by_bill.BillID</code>.
     */
    public void setBillid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_milktea.vw_sum_drink_by_bill.BillID</code>.
     */
    public Integer getBillid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_milktea.vw_sum_drink_by_bill.SumDrink</code>.
     */
    public void setSumdrink(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_milktea.vw_sum_drink_by_bill.SumDrink</code>.
     */
    public BigInteger getSumdrink() {
        return (BigInteger) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, BigInteger> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, BigInteger> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VwSumDrinkByBill.VW_SUM_DRINK_BY_BILL.BILLID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return VwSumDrinkByBill.VW_SUM_DRINK_BY_BILL.SUMDRINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getBillid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component2() {
        return getSumdrink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getBillid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value2() {
        return getSumdrink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwSumDrinkByBillRecord value1(Integer value) {
        setBillid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwSumDrinkByBillRecord value2(BigInteger value) {
        setSumdrink(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwSumDrinkByBillRecord values(Integer value1, BigInteger value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VwSumDrinkByBillRecord
     */
    public VwSumDrinkByBillRecord() {
        super(VwSumDrinkByBill.VW_SUM_DRINK_BY_BILL);
    }

    /**
     * Create a detached, initialised VwSumDrinkByBillRecord
     */
    public VwSumDrinkByBillRecord(Integer billid, BigInteger sumdrink) {
        super(VwSumDrinkByBill.VW_SUM_DRINK_BY_BILL);

        set(0, billid);
        set(1, sumdrink);
    }
}
