/*
    This file is part of Cyclos (www.cyclos.org).
    A project of the Social Trade Organisation (www.socialtrade.org).

    Cyclos is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Cyclos is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Cyclos; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 */
package nl.strohalm.cyclos.services.transactions;

import java.util.Calendar;

import nl.strohalm.cyclos.entities.accounts.loans.Loan.Type;

/**
 * Parameters for granting a loan with interest
 * @author luis
 */
public class GrantLoanWithInterestDTO extends GrantLoanDTO {

    private static final long serialVersionUID = -6637355488102983527L;

    private Calendar          firstRepaymentDate;
    private Integer           paymentCount;

    public Calendar getFirstRepaymentDate() {
        return firstRepaymentDate;
    }

    @Override
    public Type getLoanType() {
        return Type.WITH_INTEREST;
    }

    public Integer getPaymentCount() {
        return paymentCount;
    }

    public void setFirstRepaymentDate(final Calendar firstParcelRepaymentDate) {
        firstRepaymentDate = firstParcelRepaymentDate;
    }

    public void setPaymentCount(final Integer parcelCount) {
        paymentCount = parcelCount;
    }
}
