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
package nl.strohalm.cyclos.services.stats;

import nl.strohalm.cyclos.entities.reports.StatisticalTaxesQuery;
import nl.strohalm.cyclos.exceptions.PermissionDeniedException;

/**
 * Security implementation for {@link StatisticalTaxesService}
 * 
 * @author Rinke
 */
public class StatisticalTaxesServiceSecurity extends StatisticalServiceSecurity implements StatisticalTaxesService {

    public StatisticalResultDTO getComparePeriodsMaxMember(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getComparePeriodsMaxMember(query);
    }

    public StatisticalResultDTO getComparePeriodsMedianPerMember(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getComparePeriodsMedianPerMember(query);
    }

    public StatisticalResultDTO getComparePeriodsNumberOfMembers(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getComparePeriodsNumberOfMembers(query);
    }

    public StatisticalResultDTO getComparePeriodsRelativeToGrossProduct(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getComparePeriodsRelativeToGrossProduct(query);
    }

    public StatisticalResultDTO getComparePeriodsVolume(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getComparePeriodsVolume(query);
    }

    public StatisticalResultDTO getDistributionMedianPerMember(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getDistributionMedianPerMember(query);
    }

    public StatisticalResultDTO getDistributionRelativeToGrossProduct(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getDistributionRelativeToGrossProduct(query);
    }

    public StatisticalResultDTO getSinglePeriodMaxMember(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getSinglePeriodMaxMember(query);
    }

    public StatisticalResultDTO getSinglePeriodMedianPerMember(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getSinglePeriodMedianPerMember(query);
    }

    public StatisticalResultDTO getSinglePeriodNumberOfMembers(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getSinglePeriodNumberOfMembers(query);
    }

    public StatisticalResultDTO getSinglePeriodRelativeToGrossProduct(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getSinglePeriodRelativeToGrossProduct(query);
    }

    public StatisticalResultDTO getSinglePeriodVolume(final StatisticalTaxesQuery query) {
        throw new PermissionDeniedException();
        // return ((StatisticalTaxesServiceLocal) getStatisticalService()).getSinglePeriodVolume(query);
    }

    public StatisticalResultDTO getThroughTimeMaxMember(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getThroughTimeMaxMember(query);
    }

    public StatisticalResultDTO getThroughTimeMedianPerMember(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getThroughTimeMedianPerMember(query);
    }

    public StatisticalResultDTO getThroughTimeNumberOfMembers(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getThroughTimeNumberOfMembers(query);
    }

    public StatisticalResultDTO getThroughTimeRelativeToGrossProduct(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getThroughTimeRelativeToGrossProduct(query);
    }

    public StatisticalResultDTO getThroughTimeVolume(final StatisticalTaxesQuery query) {
        checkPermission();
        return ((StatisticalTaxesServiceLocal) getStatisticalService()).getThroughTimeVolume(query);
    }

    public void setStatisticalTaxesServiceLocal(final StatisticalTaxesServiceLocal statisticalService) {
        setStatisticalServiceLocal(statisticalService);
    }

}
